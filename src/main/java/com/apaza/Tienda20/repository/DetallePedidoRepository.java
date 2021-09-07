package com.apaza.Tienda20.repository;

import com.apaza.Tienda20.entity.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido , Long> {

    List<DetallePedido> findByPedidoId(Long id);
    List<DetallePedido> findAllByPedidoFecha(LocalDate fecha);

}
