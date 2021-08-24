package com.apaza.Tienda20.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Gastos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double costo;
    private String hola;
    private LocalDate fecha;

    @PrePersist
    void Prepersit() {
        fecha = LocalDate.now();
    }

}
