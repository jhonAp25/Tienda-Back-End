package com.apaza.Tienda20.controller;

import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.entity.TipoProducto;
import com.apaza.Tienda20.services.ModeloServices;
import com.apaza.Tienda20.services.TipoProductoServices;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TipoModelo")
@RequiredArgsConstructor
public class TipoModelo {


    private final  TipoProductoServices tipoProductoServices;


    private final ModeloServices modeloServices;



    @PostMapping("/{idTipo}/{idModelo}")
    public ResponseEntity<?> updateTipoModel(@PathVariable Long idTipo , @PathVariable Long idModelo){



        if (tipoProductoServices.findTipo(idTipo)){
            TipoProducto tipoNew =  tipoProductoServices.listarId(idTipo);
            Modelo modelo =  modeloServices.listarId(idModelo);
            tipoNew.getModelo().add(modelo);
            return new ResponseEntity<>(tipoProductoServices.updateDetalle(idTipo, tipoNew), HttpStatus.CREATED);
        }

        return new ResponseEntity<>("¡Producto no encontrado!",HttpStatus.NOT_FOUND);


    }

}
