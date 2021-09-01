package com.apaza.Tienda20.services;


import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.entity.TipoProducto;
import com.apaza.Tienda20.repository.ProductoRepository;
import com.apaza.Tienda20.util.exception.BadRequestException;
import com.apaza.Tienda20.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductoServices {
    @Autowired
    ProductoRepository productoRepository;



    public List<Producto>Listado(){
        List<Producto> producto = productoRepository.findAll();
        if(producto.isEmpty()) throw new NotFoundException("No hay Productos aun....");
        return producto;
    }
//    public List<Producto>ListadoFecha(Date fecha){
//        List<Producto> producto = productoRepository.findByFechaC(fecha);
//        if(producto.isEmpty()) throw new NotFoundException("No hay Productos aun....");
//        return producto;
//    }

    public Producto ListarId(Long id){
         Producto producto=  productoRepository.findById(id).orElse(null);
         if(producto == null) throw new NotFoundException("No existe un producto con el ID: "+ id);
         return producto;

    }

    public List<Producto> FiltroModelo(Long id){
        return  productoRepository.findAllByModeloId(id);
    }

    public List<Producto> filtroModeloColorTalla(Long idMod, Long idTal, Long idCol){
        return  productoRepository.findAllByModeloIdAndTallaIdAndColorId(idMod, idTal,idCol);
    }

    public List<Producto> filtroModeloColor(Long idMod, Long idCol){
        return  productoRepository.findAllByModeloIdAndColorId(idMod,idCol);
    }

    public List<Producto> filtroModeloTalla(Long idMod, Long idTal){
        return  productoRepository.findAllByModeloIdAndTallaId(idMod,idTal);
    }




    public Producto Guardar(Producto prod){


        return productoRepository.save(prod);

    }

    public Producto Actualizar(Integer stock , Long id) {
// Creo q aun flata completar el codigo de (TIPO - MODELO)
          Producto newProd =  productoRepository.findById(id).orElse(null);

          newProd.setStock(stock);

        return productoRepository.save(newProd);
    }




}
