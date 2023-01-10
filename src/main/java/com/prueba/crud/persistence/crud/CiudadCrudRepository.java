package com.prueba.crud.persistence.crud;

import com.prueba.crud.persistence.entity.Ciudad;
import org.springframework.data.repository.CrudRepository;

public interface CiudadCrudRepository extends CrudRepository<Ciudad, Integer> {
}
