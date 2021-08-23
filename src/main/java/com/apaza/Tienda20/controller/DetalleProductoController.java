package com.apaza.Tienda20.controller;


import com.apaza.Tienda20.entity.DetalleProducto;
import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.services.DetalleProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tipoProducto")
@CrossOrigin(origins = "*")
public class DetalleProductoController {

    @Autowired
    DetalleProductoServices services;

//    @GetMapping("/listaModelo/{id}")
//    public List<DetalleProducto> listaModeloId(@PathVariable Long id){
//        return services.listarModeloId(id);
//    }

}
