package com.apaza.Tienda20.services;

import com.apaza.Tienda20.entity.Modelo;
import com.apaza.Tienda20.entity.TipoProducto;
import com.apaza.Tienda20.repository.TipoProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoProductoServices {



    private final TipoProductoRepository tipoProductoRepository;

    public Boolean findTipo(Long id){
        return tipoProductoRepository.existsById(id);
    }

    public List<TipoProducto> listar(){
        return tipoProductoRepository.findAll();
    }
//
    public  TipoProducto listarId(Long id){
        return tipoProductoRepository.findById(id).orElse(null);
    }

    public TipoProducto guardar(TipoProducto tipoProducto){
        return tipoProductoRepository.save(tipoProducto);
    }

    public TipoProducto updateDetalle(Long id, TipoProducto tipoProducto){

            TipoProducto newTipo = listarId(id);
            newTipo.setNombre(tipoProducto.getNombre());
            newTipo.setModelo(tipoProducto.getModelo());
            return tipoProductoRepository.save(newTipo);


    }
}
