package com.apaza.Tienda20.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;



}
