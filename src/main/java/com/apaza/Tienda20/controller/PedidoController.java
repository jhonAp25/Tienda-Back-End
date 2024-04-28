package com.apaza.Tienda20.controller;


import com.apaza.Tienda20.entity.DetallePedido;
import com.apaza.Tienda20.entity.Pedido;
import com.apaza.Tienda20.services.PedidoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
@RequiredArgsConstructor
public class PedidoController {



    private final PedidoServices services;

    @GetMapping("/lista")
    public List<Pedido> listado(){
        return services.listado();
    }

    @GetMapping("/listaId/{id}")
    public Pedido listadoPorId(@PathVariable Long id){
        return services.findByID(id);
    }

    @PostMapping
    public Pedido savePedido(@RequestBody Pedido pedido){
        return services.savePedido(pedido);
    }

    @DeleteMapping("/delete/{id}")
    public void  deletePedid(@PathVariable Long id){
        services.deletePedido(id);
    }

    @GetMapping("/listaNow")
    public List<Pedido> listaHoy(){
        return services.pedidoNow();
    }



}
