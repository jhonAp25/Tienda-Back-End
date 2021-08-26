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




//    public Producto Guardar(Producto prod){
//        Producto newProd = new Producto();
//        if (prod.getColor().isEmpty() )  throw new BadRequestException("Complete el campo color"  );
//        newProd.setColor(prod.getColor());
//        if (prod.getTalla().isEmpty()) throw new BadRequestException("Complete el campo TALLA"   );
//        newProd.setTalla(prod.getTalla());
//
//        if(prod.getPrecio()== 0)  throw new BadRequestException("Complete el campo PRECIO"   );
//        newProd.setPrecio(prod.getPrecio());
//        if (prod.getModelo().getId().equals(0))   throw new BadRequestException("Seleccione un MODELO"  );
//        newProd.setModelo(prod.getModelo());
//        if (prod.getTipoProducto().getId().equals(0))throw new BadRequestException("Seleccione un Tipo de Producto"  );
//        newProd.setTipoProducto(prod.getTipoProducto());
//
//
//            return productoRepository.save(newProd);
//
//    }

//    public Producto Actulaizar(Producto prod) {
//// Creo q aun flata completar el codigo de (TIPO - MODELO)
//          Producto newProd =  productoRepository.findById(prod.getId()).orElse(null);
//
//          newProd.setColor(prod.getColor());
//          newProd.setMarca(prod.getMarca());
//          newProd.setPrecio(prod.getPrecio());
//          newProd.setTalla(prod.getTalla());
//
//
//
//        return productoRepository.save(newProd);
//    }




}
