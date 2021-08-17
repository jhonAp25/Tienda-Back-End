package com.apaza.Tienda20.mapper;
import com.apaza.Tienda20.entity.Producto;

import java.util.ArrayList;
import java.util.Collection;

public class ProductoMapper {
    public static Collection<ProductoDTO> convert(Collection<Producto>itemsProducto){
        Collection<ProductoDTO> collection=new ArrayList<>();

        for(Producto prod:itemsProducto)
        {
            ProductoDTO mapper=new ProductoDTO();

//            mapper.setTipoProducto(prod.getTipoProducto().getNombre());
//            mapper.setModelo(prod.getModelo().getNombre());
//            mapper.setTalla(prod.getTalla());
//            mapper.setPrecio(prod.getPrecio());
//            mapper.setColor(prod.getColor());
//            mapper.setFecha(prod.getFechaC());
            mapper.setProductoId(prod.getId());

            collection.add(mapper);
        }

        return collection;
    }
}
