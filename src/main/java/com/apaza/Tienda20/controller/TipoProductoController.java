package com.apaza.Tienda20.controller;

import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.entity.TipoProducto;
import com.apaza.Tienda20.services.TipoProductoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoProducto")
@RequiredArgsConstructor
public class TipoProductoController {

    private final TipoProductoServices tipoProductoServices;

    @GetMapping("/lista")
    public List<TipoProducto> listado(){
        return tipoProductoServices.listar();
    }

    @PostMapping("/guardar")
    public TipoProducto guardar(@RequestBody TipoProducto tipo){
        return tipoProductoServices.guardar(tipo);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> update(@PathVariable Long id ,  @RequestBody TipoProducto tipo){
        return ResponseEntity.status(HttpStatus.OK).body(tipoProductoServices.updateDetalle(id, tipo));
    }

    @GetMapping("/listaId/{id}")
    public TipoProducto listadoId(@PathVariable Long id){
        return tipoProductoServices.listarId(id);
    }
}
