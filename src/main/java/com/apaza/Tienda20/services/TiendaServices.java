package com.apaza.Tienda20.services;

import com.apaza.Tienda20.entity.Tienda;
import com.apaza.Tienda20.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaServices {

    @Autowired
    private TiendaRepository repository;

    public List<Tienda> listado(){
        return repository.findAll();
    }

    public Tienda saves(Tienda tienda){
        return repository.save(tienda);
    }

    public Tienda findbyTienda(Long id){
        return repository.findById(id).orElse(null);
    }
}
