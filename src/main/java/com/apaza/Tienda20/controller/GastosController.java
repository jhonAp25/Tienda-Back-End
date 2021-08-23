package com.apaza.Tienda20.controller;

import com.apaza.Tienda20.entity.Gastos;
import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.services.GastoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
@CrossOrigin(origins = "*")
public class GastosController {
    @Autowired
    GastoServices services;

    @GetMapping("/lista")
    public List<Gastos> listado(){
        return services.lista();
    }

    @GetMapping("/listaAlDia")
    public List<Gastos> listadoPorDia(){
        return services.listaPorDia();
    }

    @PostMapping
    public Gastos saveGastos(@RequestBody Gastos gastos){
        return services.saveGasto(gastos);
    }
}
