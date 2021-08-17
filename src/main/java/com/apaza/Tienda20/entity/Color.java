package com.apaza.Tienda20.entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String codigo;
    private String nombre;




}
