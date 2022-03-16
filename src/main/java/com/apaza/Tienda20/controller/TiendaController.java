package com.apaza.Tienda20.controller;

import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.entity.Tienda;
import com.apaza.Tienda20.services.TiendaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tienda")
@CrossOrigin(origins = "*")
public class TiendaController {

    @Autowired
    private TiendaServices services;

    @GetMapping("/lista")
    public ResponseEntity<?> listar(){
        return new ResponseEntity<>(services.listado(), HttpStatus.OK);
    }



    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public Tienda guardar(@RequestBody Tienda tienda){
        return services.saves(tienda);
    }

    @GetMapping("/listaId/{id}")
    public Tienda buscarId(@PathVariable Long id){
        return services.findbyTienda(id);
    }


}
