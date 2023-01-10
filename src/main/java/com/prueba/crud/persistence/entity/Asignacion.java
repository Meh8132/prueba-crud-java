package com.prueba.crud.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Asignacion")
public class Asignacion {

//    Columnas Asignacion

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAsignacion;
    private LocalDateTime fechaAsignacion;
    private Boolean estaActiva;
    @Column(name = "IdTurista_Turista")
    private Integer turistaFK;
    @Column(name = "IdCiudad_Ciudad")
    private Integer ciudadFK;

//    Relaciones

    @ManyToOne
    @JoinColumn(name = "IdCiudad_Ciudad", insertable = false, updatable = false)
    private Ciudad Ciudad;

    @ManyToOne
    @JoinColumn(name = "IdTurista_Turista", insertable = false, updatable = false)
    private Turista Turista;

//    Getters y Setters

    public Integer getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public LocalDateTime getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Boolean getEstaActiva() {
        return estaActiva;
    }

    public void setEstaActiva(Boolean estaActiva) {
        this.estaActiva = estaActiva;
    }

    public Integer getTuristaFK() {
        return turistaFK;
    }

    public void setTuristaFK(Integer turistaFK) {
        this.turistaFK = turistaFK;
    }

    public Integer getCiudadFK() {
        return ciudadFK;
    }

    public void setCiudadFK(Integer ciudadFK) {
        this.ciudadFK = ciudadFK;
    }
}
