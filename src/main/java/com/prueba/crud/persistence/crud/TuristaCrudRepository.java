package com.prueba.crud.persistence.crud;

import com.prueba.crud.persistence.entity.Turista;
import org.springframework.data.repository.CrudRepository;

public interface TuristaCrudRepository extends CrudRepository<Turista, Integer> {
}
