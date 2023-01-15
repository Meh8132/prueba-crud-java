package com.prueba.crud.domain.repository;

import com.prueba.crud.domain.Tourist;

import java.util.List;

public interface TouristRepository {
    List<Tourist> getTouristList();
    Tourist addTourist(Tourist tourist);
    void delTourist(int touristId);
}
