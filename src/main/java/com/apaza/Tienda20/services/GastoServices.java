package com.apaza.Tienda20.services;

import com.apaza.Tienda20.entity.Gastos;
import com.apaza.Tienda20.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class GastoServices {

    @Autowired
    GastoRepository repository;

    public List<Gastos> lista() {
        return repository.findAll();
    }

    public List<Gastos> listaPorDia() {
        return repository.findAllByFecha(LocalDate.now());
    }

    public Gastos saveGasto(Gastos gastos) {

        return repository.save(gastos);
    }
}
