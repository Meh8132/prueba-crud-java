package com.prueba.crud.persistence.crud;

import com.prueba.crud.persistence.entity.Asignacion;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AsignacionCrudRepository extends CrudRepository<Asignacion, Integer> {

//    Query Methods (Consultas)

    List<Asignacion> findByTuristaFKOrderByFechaAsignacionDesc(Integer turistaFK);

    List<Asignacion> findByCiudadFKOrderByFechaAsignacionDesc(Integer ciudadFK);

    List<Asignacion> findByCiudadFKAndFechaAsignacion(Integer ciudadFK, LocalDateTime fechaAsignacion);
}
