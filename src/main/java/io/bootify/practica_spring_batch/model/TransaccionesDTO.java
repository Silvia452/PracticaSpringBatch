package io.bootify.practica_spring_batch.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;


public class TransaccionesDTO {

    private Long id;

    @NotNull
    private LocalDate fecha;

    @NotNull
    private Double cantidad;

    @NotNull
    @Size(max = 255)
    private String tipoTrans;

    @NotNull
    @Size(max = 255)
    private String cuentaOrigen;

    @NotNull
    @Size(max = 255)
    private String cuentaDestino;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(final LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(final Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoTrans() {
        return tipoTrans;
    }

    public void setTipoTrans(final String tipoTrans) {
        this.tipoTrans = tipoTrans;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(final String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(final String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

}
