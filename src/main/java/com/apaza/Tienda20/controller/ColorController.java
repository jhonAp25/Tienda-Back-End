package com.apaza.Tienda20.controller;

import com.apaza.Tienda20.entity.Color;
import com.apaza.Tienda20.services.ColorServices;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/color")
@Validated
@RequiredArgsConstructor
public class ColorController{


    private final  ColorServices services;


    @GetMapping
    public List<Color> lista(){
        return services.lista();
    }

    @PostMapping
    public Color guardar(Color  color){
        return services.saveColor(color);
    }
}
