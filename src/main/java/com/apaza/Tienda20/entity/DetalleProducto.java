package com.apaza.Tienda20.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class DetalleProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




}
