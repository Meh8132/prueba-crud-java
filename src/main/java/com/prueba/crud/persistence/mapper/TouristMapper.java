package com.prueba.crud.persistence.mapper;

import com.prueba.crud.domain.Tourist;
import com.prueba.crud.persistence.entity.Turista;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {CityMapper.class})
public interface TouristMapper {
    @Mappings({
            @Mapping(source = "idTurista", target = "touristId"),
            @Mapping(source = "tipoIdentificacion", target = "idType"),
            @Mapping(source = "nombreCompleto", target = "fullName"),
            @Mapping(source = "fechaNacimiento", target = "birthDate"),
            @Mapping(source = "frecuenciaViaje", target = "travelFrec"),
            @Mapping(source = "presupuestoViaje", target = "travelBudget"),
            @Mapping(source = "usaTarjeta", target = "usesCard"),
            @Mapping(source = "idCiudadDestino", target = "arriveCityId"),
            @Mapping(source = "ciudad", target = "city")
    })
    Tourist toTourist(Turista turista);

    @InheritInverseConfiguration
    @Mapping(target = "asignaciones", ignore = true)
    Turista toTurista(Tourist tourist);

}
