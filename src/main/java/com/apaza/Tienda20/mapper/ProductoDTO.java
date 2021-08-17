package com.apaza.Tienda20.mapper;

import java.io.Serializable;
import java.util.Date;

public class ProductoDTO implements Serializable {
    private Long productoId;
    private String tipoProducto;
    private String modelo;
    private String talla;
    private String Color;

    private Date fecha;
    private double Precio;

    public ProductoDTO() {
    }

    public ProductoDTO(Long productoId, String tipoProducto, String modelo, String talla, String color, Date fecha, double precio) {
        this.productoId = productoId;
        this.tipoProducto = tipoProducto;
        this.modelo = modelo;
        this.talla = talla;
        Color = color;
        this.fecha= fecha;
        Precio = precio;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
}

