package com.apaza.Tienda20.services;

import com.apaza.Tienda20.entity.Color;
import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ColorServices {

    @Autowired
    ColorRepository repository;


    public List<Color> lista(){

        return repository.findAll();
    }

    public Color saveColor(Color color){
        return repository.save(color);
    }

    public Color buscar (Long id){
        return repository.findById(id).orElse(null);
    }

    public Color updateColor(Color color){
        Color newColor =  repository.findById(color.getId()).orElse(null);

        return repository.save(newColor);
    }
}
