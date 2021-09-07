package com.apaza.Tienda20.services;


import com.apaza.Tienda20.entity.DetallePedido;
import com.apaza.Tienda20.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DetallePedidoServices {

    @Autowired
    DetallePedidoRepository repository;

    public List<DetallePedido> listado(){
        return repository.findAll();
    }

    public List<DetallePedido> findByIDPedido(Long id){
        return repository.findByPedidoId(id);
    }

    public DetallePedido saveDetallePedido(DetallePedido detallePedido){
        return repository.save(detallePedido);
    }

    public List<DetallePedido> findByPedidoFecha(){
        return repository.findAllByPedidoFecha(LocalDate.now());
    }
}
