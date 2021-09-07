package com.apaza.Tienda20.repository;

import com.apaza.Tienda20.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByFecha(LocalDate fecha);
}
