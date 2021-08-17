package com.apaza.Tienda20.services;

import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.entity.TipoProducto;
import com.apaza.Tienda20.repository.TipoProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TipoProductoServices {


    @Autowired
    TipoProductoRepository tipoProductoRepository;

    public List<TipoProducto> listar(){
        return tipoProductoRepository.findAll();
    }
//
//    public  List<TipoProducto> listarId(Long id){
//        return tipoProductoRepository.getTipoProductoById(id);
//    }

    public TipoProducto guardar(TipoProducto tipoProducto){
        return tipoProductoRepository.save(tipoProducto);
    }

}
