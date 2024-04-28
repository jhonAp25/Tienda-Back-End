package com.apaza.Tienda20.controller;

import com.apaza.Tienda20.entity.Gastos;
import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.services.GastoServices;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
@Validated
@RequiredArgsConstructor
public class GastosController {

    private final GastoServices services;

    @GetMapping("/lista")
    public List<Gastos> listado(){
        return services.lista();
    }

    @GetMapping("/listaAlDia")
    public List<Gastos> listadoPorDia(){
        return services.listaPorDia();
    }

    @PostMapping
    public Gastos saveGastos(@RequestBody Gastos gasto){
        return services.saveGasto(gasto);
    }
}
