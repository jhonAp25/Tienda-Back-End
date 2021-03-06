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


import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    ProductoServices productoServices;



    @GetMapping("/lista")
    public ResponseEntity<?> listar(){

        return new ResponseEntity<>(productoServices.Listado(), HttpStatus.OK);
    }




    @GetMapping("/listaId/{id}")
    public Producto ListaId(@PathVariable Long id){
        return productoServices.ListarId(id);

    }

    @GetMapping("/listaIdDto/{id}")
    public List<?> ListaIdDto(@PathVariable Long id){
        return productoServices.FiltroModeloDto(id);

    }


    @GetMapping("/ListaModelo/{id}")
    public List<Producto> ListaPorModelo (@PathVariable Long id){
        return   productoServices.FiltroModelo(id);
    }

    @GetMapping("/ModeloCustom/{idMol}/{idTal}/{idCol}")
    public List<Producto> ListaCustom (@PathVariable Long idMol ,@PathVariable Long idTal,@PathVariable Long idCol ){
        return   productoServices.filtroModeloColorTalla(idMol, idTal, idCol);
    }

    @GetMapping("/ModeloColor/{idMol}/{idCol}")
    public List<Producto> ListaColorModelo(@PathVariable Long idMol ,@PathVariable Long idCol ){
        return   productoServices.filtroModeloColor(idMol,  idCol);
    }


    @GetMapping("/ModeloTalla/{idMol}/{idTal}")
    public List<Producto> ListaTallaModelo(@PathVariable Long idMol ,@PathVariable Long idTal ){
        return   productoServices.filtroModeloTalla(idMol,  idTal);
    }


    //    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public Producto guardar(@RequestBody Producto prod){
        return productoServices.Guardar(prod);
    }




    //
//    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public Producto updateStock (Integer stock , Long id){
        return productoServices.Actualizar(stock, id);
    }

}
