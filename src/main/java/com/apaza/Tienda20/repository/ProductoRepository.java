package com.apaza.Tienda20.repository;
import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.entity.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto , Long> {

//    List<Producto> findByTipoProductoId(Long id);
//    List<Producto> findByFechaC(Date fecha);

}
