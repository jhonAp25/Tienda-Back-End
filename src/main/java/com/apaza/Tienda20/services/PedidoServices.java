package com.apaza.Tienda20.services;


import com.apaza.Tienda20.entity.Pedido;
import com.apaza.Tienda20.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoServices {


    private final  PedidoRepository repository;

    public List<Pedido> listado(){
        return repository.findAll();
    }

    public Pedido findByID(Long id){
        return repository.findById(id).orElse(null);
    }

    public Pedido savePedido(Pedido pedido) {
        return repository.save(pedido);
    }

    public void  deletePedido(Long id) {
        repository.deleteById(id);
    }

    public List<Pedido> pedidoNow(){
        return repository.findByFecha(LocalDate.now());
    }


}
