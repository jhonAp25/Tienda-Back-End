package com.apaza.Tienda20.repository;

import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ModeloRepository extends JpaRepository<Modelo , Long> {

//    @Query("select m from Modelo m inner join TipoProducto  tp on m.tipoProducto.id = tp.id where tp.id = ?1")
//    List<Modelo> listaModeloID (Long id);
//
//    List<Modelo> getModeloById (Long id);
}

