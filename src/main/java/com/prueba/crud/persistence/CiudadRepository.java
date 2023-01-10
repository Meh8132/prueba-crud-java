package com.prueba.crud.persistence;

import com.prueba.crud.persistence.crud.CiudadCrudRepository;
import com.prueba.crud.persistence.entity.Ciudad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CiudadRepository {

    private CiudadCrudRepository CiudadCrudRepository;

//    Consultas

    public List<Ciudad> getCiudadesList(){
        return (List<Ciudad>) CiudadCrudRepository.findAll();
    }

//    Agregar y Borrar

    public Ciudad addCiudad(Ciudad Ciudad){
        return CiudadCrudRepository.save(Ciudad);
    }

    public void delCiudad(Integer idCiudad){
        CiudadCrudRepository.deleteById(idCiudad);
    }
}
