package com.prueba.crud.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Turista")
public class Turista {

//    Columnas Turista

    @Id
    private Integer idTurista;
    private String tipoIdentificacion;
    private String nombreCompleto;
    private LocalDateTime fechaNacimiento;
    private Integer frecuenciaViaje;
    private BigDecimal presupuestoViaje;
    private Boolean usaTarjeta;
    @Column(name = "IdCiudad_Ciudad")
    private Integer idCiudadDestino;

//    Relaciones

    @ManyToOne
    @JoinColumn(name = "IdCiudad_Ciudad", insertable = false, updatable = false)
    private Ciudad ciudad;

    @OneToMany(mappedBy = "turista")
    private List<Asignacion> asignaciones;

//  Getters y Setters


    public Integer getIdTurista() {
        return idTurista;
    }

    public void setIdTurista(Integer idTurista) {
        this.idTurista = idTurista;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getFrecuenciaViaje() {
        return frecuenciaViaje;
    }

    public void setFrecuenciaViaje(Integer frecuenciaViaje) {
        this.frecuenciaViaje = frecuenciaViaje;
    }

    public BigDecimal getPresupuestoViaje() {
        return presupuestoViaje;
    }

    public void setPresupuestoViaje(BigDecimal presupuestoViaje) {
        this.presupuestoViaje = presupuestoViaje;
    }

    public Boolean getUsaTarjeta() {
        return usaTarjeta;
    }

    public void setUsaTarjeta(Boolean usaTarjeta) {
        this.usaTarjeta = usaTarjeta;
    }

    public Integer getIdCiudadDestino() {
        return idCiudadDestino;
    }

    public void setIdCiudadDestino(Integer idCiudadDestino) {
        this.idCiudadDestino = idCiudadDestino;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
