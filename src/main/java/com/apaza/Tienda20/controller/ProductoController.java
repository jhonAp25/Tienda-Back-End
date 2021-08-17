package com.apaza.Tienda20.controller;


import com.apaza.Tienda20.entity.Producto;
import com.apaza.Tienda20.mapper.EstadisticaDTO;
import com.apaza.Tienda20.mapper.EstadisticaMapper;
import com.apaza.Tienda20.mapper.ProductoMapper;
import com.apaza.Tienda20.mapper.ProductoDTO;
import com.apaza.Tienda20.services.ProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    ProductoServices productoServices;



    @GetMapping("/lista")
    public ResponseEntity<?> listar(){
//        Collection<Producto> itemsProducto= productoServices.Listado();
//        Collection<ProductoDTO> itemsProductoDTO = ProductoMapper.convert(itemsProducto);

        return new ResponseEntity<>(productoServices.Listado(), HttpStatus.OK);
    }

//    @GetMapping("/listaXFecha")
//    public ResponseEntity<?> listarFecha(){
//        Date ahora = new Date();
//        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-mm-dd");
//
//        Collection<Producto> itemsProducto= productoServices.ListadoFecha(ahora);
//        Collection<ProductoDTO> itemsProductoDTO = ProductoMapper.convert(itemsProducto);
//
//        return new ResponseEntity<>(itemsProductoDTO, HttpStatus.OK);
//    }


    @GetMapping("/estadistica")
    public ResponseEntity<?>listarEstadistica(){
        Collection<Producto> itemsProducto = productoServices.Listado();
        Collection<EstadisticaDTO> itemsEstadisticaDTO = EstadisticaMapper.convert(itemsProducto);

        return new ResponseEntity<>(itemsEstadisticaDTO,HttpStatus.OK);
    }

//    @PreAuthorize("hasRole('ADMIN')")
//    @PostMapping("/guardar")
//    public Producto guardar(@RequestBody Producto prod){
//        return productoServices.Guardar(prod);
//    }


    @GetMapping("/listaId/{id}")
    public Producto ListaId(@PathVariable Long id){
        return productoServices.ListarId(id);

    }


//    @PutMapping("/actualizar/{id}")
//    public Producto actualizarProd (@RequestBody Producto prod){
//        return   productoServices.Actulaizar(prod);
//    }

//
//    @PreAuthorize("hasRole('ADMIN')")
//        @GetMapping("/ventaTipo/{tipo}")
//    public List<Producto> ventaTipo (@PathVariable Long tipo){
//        return productoServices.FiltroTipoV(tipo);
//    }

}
