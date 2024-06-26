package com.apaza.Tienda20.controller;

import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.services.ModeloServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/modelo")
@RequiredArgsConstructor
@RestController
public class ModeloController {

    private final ModeloServices modeloServices;

    @GetMapping("/lista")
    public List<Modelo> listado(){
        return modeloServices.listar();
    }

    @PostMapping("/guardar")
    public  Modelo guardar(@RequestBody Modelo modelo){
        return modeloServices.guardar(modelo);
    }

//    @GetMapping("/ListaId/{id}")
//    public List<Modelo> listadoCondicional(@PathVariable  Long id){
//        return modeloServices.listadoCondicional(id);
//    }

//    @GetMapping("/modeloId/{id}")
//    public List<Modelo> modeloID(@PathVariable  Long id){
//        return modeloServices.modeloID(id);
//    }
}
