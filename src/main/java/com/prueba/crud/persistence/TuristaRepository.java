package com.prueba.crud.persistence;

import com.prueba.crud.persistence.crud.TuristaCrudRepository;
import com.prueba.crud.persistence.entity.Turista;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TuristaRepository {

    private TuristaCrudRepository TuristaCrudRepository;

//    Consultas

    public List<Turista> getTuristasList(){
        return (List<Turista>) TuristaCrudRepository.findAll();
    }

//    Agregar y Borrar

    public Turista addTurista(Turista Turista){
        return TuristaCrudRepository.save(Turista);
    }

    public void delTurista(Integer idTurista){
        TuristaCrudRepository.deleteById(idTurista);
    }
}
