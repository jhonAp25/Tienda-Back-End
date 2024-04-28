package com.apaza.Tienda20.controller;


import com.apaza.Tienda20.entity.DetallePedido;
import com.apaza.Tienda20.entity.Gastos;
import com.apaza.Tienda20.services.DetallePedidoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallePedido")
@Validated
@RequiredArgsConstructor
public class DetallePedidoController {


    private final DetallePedidoServices services;

    @GetMapping("/lista")
    public List<DetallePedido> listado(){
        return services.listado();
    }

    @GetMapping("/lista/{id}")
    public DetallePedido ListaId(@PathVariable Long id){
        return services.listaId(id);
    }


    @GetMapping("/listaPorPedido/{id}")
    public List<DetallePedido> listadoPorPedido(@PathVariable Long id){
        return services.findByIDPedido(id);
    }

    @PostMapping
    public DetallePedido saveDetallePedido(@RequestBody DetallePedido detallePedido){
        return services.saveDetallePedido(detallePedido);
    }
//    findByPedidoFecha
    @GetMapping("/listaPorFechaPedido")
    public List<DetallePedido> listadoPorFechaPedido(){
    return services.findByPedidoFecha();
}


}
