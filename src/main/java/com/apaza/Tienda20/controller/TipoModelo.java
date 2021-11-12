package com.apaza.Tienda20.controller;


import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.entity.TipoProducto;
import com.apaza.Tienda20.services.ModeloServices;
import com.apaza.Tienda20.services.TipoProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/TipoModelo")
@CrossOrigin(origins = "*")
public class TipoModelo {

    @Autowired
    private TipoProductoServices tipoProductoServices;

    @Autowired
    private ModeloServices modeloServices;



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
