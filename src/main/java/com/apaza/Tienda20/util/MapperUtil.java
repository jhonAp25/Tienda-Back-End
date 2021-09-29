package com.apaza.Tienda20.util;

import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.util.Dto.ProductoDto;

import java.util.ArrayList;
import java.util.List;

public class MapperUtil {

    public static ProductoDto productoUnico(Producto p) {
        ProductoDto prod = new ProductoDto();
        prod.setId(p.getId());
        prod.setModelo(p.getModelo().getNombre());
        prod.setColor(p.getColor().getNombre());
        prod.setTalla(p.getTalla().getDescripcion());
        prod.setStock(p.getStock());

        return prod;
    }
    public static List<ProductoDto> Productos(List<Producto> lU) {
        List<ProductoDto> lista = new ArrayList<>();
        for (Producto usuario : lU) {
            lista.add(productoUnico(usuario));
        }
        return lista;
    }

}
