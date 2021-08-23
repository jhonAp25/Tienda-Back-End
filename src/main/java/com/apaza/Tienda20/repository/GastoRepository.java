package com.apaza.Tienda20.repository;

import com.apaza.Tienda20.entity.Gastos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface GastoRepository extends JpaRepository<Gastos, Long> {

    List<Gastos> findAllByFecha(LocalDate fecha);
}
