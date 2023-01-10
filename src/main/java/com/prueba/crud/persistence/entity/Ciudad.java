package com.prueba.crud.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Ciudad")
public class Ciudad {

//    Columnas Ciudad

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCiudad;
    private String nombreCiudad;
    private Integer cantidadHabitantes;
    private String sitioTuristico;
    private String hotel;

//    Relaciones

    @OneToMany(mappedBy = "Ciudad")
    private List<Turista> Turistas;

    @OneToMany(mappedBy = "Ciudad")
    private List<Asignacion> Asignaciones;

//    Getters y Setters

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Integer getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void setCantidadHabitantes(Integer cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public String getSitioTuristico() {
        return sitioTuristico;
    }

    public void setSitioTuristico(String sitioTuristico) {
        this.sitioTuristico = sitioTuristico;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
