package com.prueba.crud.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tourist {
    private int touristId;
    private String idType;
    private String fullName;
    private LocalDateTime birthDate;
    private int travelFrec;
    private BigDecimal travelBudget;
    private boolean usesCard;
    private int arriveCityId;

    private City city;

//    Getters y Setters


    public int getTouristId() {
        return touristId;
    }

    public void setTouristId(int touristId) {
        this.touristId = touristId;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public int getTravelFrec() {
        return travelFrec;
    }

    public void setTravelFrec(int travelFrec) {
        this.travelFrec = travelFrec;
    }

    public BigDecimal getTravelBudget() {
        return travelBudget;
    }

    public void setTravelBudget(BigDecimal travelBudget) {
        this.travelBudget = travelBudget;
    }

    public boolean isUsesCard() {
        return usesCard;
    }

    public void setUsesCard(boolean usesCard) {
        this.usesCard = usesCard;
    }

    public int getArriveCityId() {
        return arriveCityId;
    }

    public void setArriveCityId(int arriveCityId) {
        this.arriveCityId = arriveCityId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
