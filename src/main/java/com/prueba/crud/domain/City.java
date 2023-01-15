package com.prueba.crud.domain;

public class City {
    private int cityId;
    private String cityName;
    private int population;
    private String tourPlace;
    private String hotel;

//    Getters y Setters

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getTourPlace() {
        return tourPlace;
    }

    public void setTourPlace(String tourPlace) {
        this.tourPlace = tourPlace;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
