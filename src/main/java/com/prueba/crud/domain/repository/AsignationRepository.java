package com.prueba.crud.domain.repository;

import com.prueba.crud.domain.Asignation;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.List;

public interface AsignationRepository {
    List<Asignation> getTouristAsignations(int touristFK);
    List<Asignation> getCityAsignations(int cityFK);
    List<Asignation> getMaxAsignations(int cityFK, LocalDateTime asignationDate);

    Asignation addAsignation(Asignation asignation);
    void delAsignation(int asignationId);
}
