package com.prueba.crud.persistence.mapper;

import com.prueba.crud.domain.City;
import com.prueba.crud.persistence.entity.Ciudad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CityMapper {
    @Mappings({
            @Mapping(source = "idCiudad", target = "cityId"),
            @Mapping(source = "nombreCiudad", target = "cityName"),
            @Mapping(source = "cantidadHabitantes", target = "population"),
            @Mapping(source = "sitioTuristico", target = "tourPlace"),
            @Mapping(source = "hotel", target = "hotel")
    })
    City toCity(Ciudad ciudad);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "turistas", ignore = true),
            @Mapping(target = "asignaciones", ignore = true)
    })
    Ciudad toCiudad(City city);
}
