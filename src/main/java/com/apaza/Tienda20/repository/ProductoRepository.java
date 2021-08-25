package com.apaza.Tienda20.repository;
import com.apaza.Tienda20.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto , Long> {

}
