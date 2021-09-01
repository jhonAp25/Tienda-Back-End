package com.apaza.Tienda20.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;
    private double subTotal;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Producto producto;

}
