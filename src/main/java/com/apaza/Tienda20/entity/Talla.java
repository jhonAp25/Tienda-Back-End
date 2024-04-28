package com.apaza.Tienda20.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;



}
