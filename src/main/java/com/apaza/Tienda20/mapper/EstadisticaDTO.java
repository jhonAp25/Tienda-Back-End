package com.apaza.Tienda20.mapper;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class EstadisticaDTO {
    private Long estadisticaId;
    private String producto;
    private Date fecha;

    public EstadisticaDTO() {
    }

    public EstadisticaDTO(Long estadisticaId, String producto, Date fecha) {
        this.estadisticaId = estadisticaId;
        this.producto = producto;
        this.fecha = fecha;
    }

    public Long getEstadisticaId() {
        return estadisticaId;
    }

    public void setEstadisticaId(Long estadisticaId) {
        this.estadisticaId = estadisticaId;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
