package com.apaza.Tienda20.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String imagenProducto;

}
