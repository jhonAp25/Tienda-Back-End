package com.apaza.Tienda20.services;

import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloServices {

    @Autowired
    ModeloRepository modeloRepository;

    public List<Modelo> listar(){
        return modeloRepository.findAll();
    }


    public Modelo guardar(Modelo modelo){
        return modeloRepository.save(modelo);
    }
//    public List<Modelo> listadoCondicional(Long id){
//        return modeloRepository.listaModeloID(id);
//    }

    public Modelo listarId(Long id){
        return modeloRepository.findById(id).orElse(null);
    }
}
