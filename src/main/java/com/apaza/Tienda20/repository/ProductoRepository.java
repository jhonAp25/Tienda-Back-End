package com.apaza.Tienda20.repository;
import com.apaza.Tienda20.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductoRepository extends JpaRepository<Producto , Long> {


    List<Producto> findAllByModeloId(Long id);
    List<Producto> findAllByModeloIdAndColorId(Long idMod, Long idCol);
    List<Producto> findAllByModeloIdAndTallaId(Long idMod, Long idTal);
    List<Producto> findAllByModeloIdAndTallaIdAndColorId(Long idMod, Long idTal, Long idCol);

}
