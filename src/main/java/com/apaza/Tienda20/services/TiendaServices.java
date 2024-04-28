package com.apaza.Tienda20.services;

import com.apaza.Tienda20.entity.Tienda;
import com.apaza.Tienda20.repository.TiendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TiendaServices {


    private final  TiendaRepository repository;

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
