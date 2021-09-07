package com.apaza.Tienda20.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;



    @PrePersist
    void Prepersist(){
        fecha = LocalDate.now();
    }
}
    