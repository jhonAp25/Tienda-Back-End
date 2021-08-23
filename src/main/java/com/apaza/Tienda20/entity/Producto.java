package com.apaza.Tienda20.entity;

        import lombok.Data;

        import javax.persistence.*;
        import java.util.Date;
        import java.util.List;


@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @PrePersist
    void Prepersist(){
        fechaIngreso = new Date();
    }

    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    private double precioMax;
    private double precioMin;
    private boolean estado;


    @ManyToOne
    private Tienda tienda;

    @ManyToOne
    private Talla talla;

    @ManyToOne
    private Color color;

    @ManyToOne
    private TipoProducto tipoProducto;



}
