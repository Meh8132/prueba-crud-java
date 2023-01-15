package com.prueba.crud.domain.repository;

import com.prueba.crud.domain.City;

import java.util.List;

public interface CityRepository {
    List<City> getCityList();
    City addCity(City city);
    void delCity(int cityId);
}
