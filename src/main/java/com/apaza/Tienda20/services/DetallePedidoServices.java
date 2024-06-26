package com.apaza.Tienda20.services;


import com.apaza.Tienda20.entity.DetallePedido;
import com.apaza.Tienda20.repository.DetallePedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DetallePedidoServices {


    private final DetallePedidoRepository repository;

    public List<DetallePedido> listado(){
        return repository.findAll();
    }

    public DetallePedido listaId(Long id){
        return repository.findById(id).orElse(null);
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
