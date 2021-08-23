package com.apaza.Tienda20.repository;

import com.apaza.Tienda20.entity.DetalleProducto;
import com.apaza.Tienda20.entity.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetalleModeloTipoRepository  extends JpaRepository<DetalleProducto , Long> {

//    List<DetalleProducto> findByTipoProductoId(Long id);
}
