package com.apaza.Tienda20.entity;

        import lombok.Data;

        import javax.persistence.*;
        import java.time.LocalDate;


@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @PrePersist
    void Prepersist(){
        fechaIngreso = LocalDate.now();
    }

    private LocalDate fechaIngreso;

    private double precioMax;
    private double precioMin;
    private int stock;
    private boolean estado;


    @ManyToOne
    private Tienda tienda;

    @ManyToOne
    private Talla talla;

    @ManyToOne
    private Color color;

    @ManyToOne
    private Modelo modelo;



}
