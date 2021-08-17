package com.apaza.Tienda20.mapper;

import com.apaza.Tienda20.entity.Producto;

import java.util.ArrayList;
import java.util.Collection;

public class EstadisticaMapper {
    public static Collection<EstadisticaDTO> convert(Collection<Producto> itemsProducto){
        Collection<EstadisticaDTO> collection = new ArrayList<>();
        for (Producto prod : itemsProducto){
            EstadisticaDTO mapper = new EstadisticaDTO();
            mapper.setEstadisticaId(prod.getId());
//            mapper.setProducto(prod.getTipoProducto().());
           // mapper.setFecha(prod.getFechaC());

            collection.add(mapper);

        }
        return collection;
    }
}


