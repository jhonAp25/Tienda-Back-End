package com.apaza.Tienda20.repository;

import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.entity.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TipoProductoRepository extends JpaRepository<TipoProducto , Long> {
//    List<TipoProducto> getTipoProductoById (Long id);
}
