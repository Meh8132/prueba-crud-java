package com.prueba.crud.persistence.mapper;

import com.prueba.crud.domain.Asignation;
import com.prueba.crud.persistence.entity.Asignacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {CityMapper.class, TouristMapper.class})
public interface AsignationMapper {
    @Mappings({
            @Mapping(source = "idAsignacion", target = "asignationId"),
            @Mapping(source = "fechaAsignacion", target = "asignationDate"),
            @Mapping(source = "estaActiva", target = "active"),
            @Mapping(source = "turistaFK", target = "touristFK"),
            @Mapping(source = "ciudadFK", target = "cityFK"),
            @Mapping(source = "ciudad", target = "city"),
            @Mapping(source = "turista", target = "tourist")
    })
    Asignation toAsignation(Asignacion asignacion);

    @InheritInverseConfiguration
    Asignacion toAsignacion(Asignation asignation);
}
