package com.apaza.Tienda20.controller;

import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.entity.TipoProducto;
import com.apaza.Tienda20.services.TipoProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoProducto")
@CrossOrigin(origins = "*")
public class TipoProductoController {
    @Autowired
    TipoProductoServices tipoProductoServices;

    @GetMapping("/lista")
    public List<TipoProducto> listado(){
        return tipoProductoServices.listar();
    }

    @PostMapping("/guardar")
    public TipoProducto guardar(@RequestBody TipoProducto tipo){
        return tipoProductoServices.guardar(tipo);
    }

    @GetMapping("/listaId/{id}")
    public TipoProducto listadoId(@PathVariable Long id){
        return tipoProductoServices.listarId(id);
    }
}
