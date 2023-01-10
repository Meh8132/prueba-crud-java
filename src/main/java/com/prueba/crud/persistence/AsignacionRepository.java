package com.prueba.crud.persistence;

import com.prueba.crud.persistence.crud.AsignacionCrudRepository;
import com.prueba.crud.persistence.entity.Asignacion;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class AsignacionRepository {

//    Consultas
    private AsignacionCrudRepository AsignacionCrudRepository;

    public List<Asignacion> getAsignacionesTurista(Integer turistaFK){
        return AsignacionCrudRepository.findByTuristaFKOrderByFechaAsignacionDesc(turistaFK);
    }

    public List<Asignacion> getAsignacionesCiudad(Integer ciudadFK){
        return AsignacionCrudRepository.findByCiudadFKOrderByFechaAsignacionDesc(ciudadFK);
    }

    public List<Asignacion> getAsignacionesMaximas(Integer ciudadFK, LocalDateTime fechaAsignacion){
        return AsignacionCrudRepository.findByCiudadFKAndFechaAsignacion(ciudadFK, fechaAsignacion);
    }

//    Agregar y Borrar

    public Asignacion addAsignacion(Asignacion Asignacion){
        return AsignacionCrudRepository.save(Asignacion);
    }

    public void delAsignacion(Integer idAsignacion){
        AsignacionCrudRepository.deleteById(idAsignacion);
    }

}
