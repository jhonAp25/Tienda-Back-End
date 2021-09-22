package com.apaza.Tienda20.controller;

import com.apaza.Tienda20.entity.Color;
import com.apaza.Tienda20.services.ColorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/color")
@CrossOrigin(origins = "*")
public class ColorController{

    @Autowired
    ColorServices services;


    @GetMapping
    public List<Color> lista(){
        return services.lista();
    }

    @PostMapping
    public Color guardar(Color  color){
        return services.saveColor(color);
    }
}
