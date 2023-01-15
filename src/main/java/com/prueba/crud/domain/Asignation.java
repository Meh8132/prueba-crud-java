package com.prueba.crud.domain;

import java.time.LocalDateTime;

public class Asignation {
    private int asignationId;
    private LocalDateTime asignationDate;
    private boolean active;
    private int touristFK;
    private int cityFK;
    private City city;
    private Tourist tourist;

//    Getters y Setters

    public int getAsignationId() {
        return asignationId;
    }

    public void setAsignationId(int asignationId) {
        this.asignationId = asignationId;
    }

    public LocalDateTime getAsignationDate() {
        return asignationDate;
    }

    public void setAsignationDate(LocalDateTime asignationDate) {
        this.asignationDate = asignationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getTouristFK() {
        return touristFK;
    }

    public void setTouristFK(int touristFK) {
        this.touristFK = touristFK;
    }

    public int getCityFK() {
        return cityFK;
    }

    public void setCityFK(int cityFK) {
        this.cityFK = cityFK;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }
}
