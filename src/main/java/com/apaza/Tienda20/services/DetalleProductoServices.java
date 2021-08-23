package com.apaza.Tienda20.services;

import com.apaza.Tienda20.entity.DetalleProducto;
import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.entity.TipoProducto;
import com.apaza.Tienda20.repository.DetalleModeloTipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleProductoServices {

    @Autowired
    DetalleModeloTipoRepository repository;



//    public List<DetalleProducto> listarModeloId(Long id){
//        return repository.findByTipoProductoId(id);
//    }

}
