package com.apaza.Tienda20.security.services;

import com.apaza.Tienda20.security.entity.Rol;
import com.apaza.Tienda20.security.enums.RolNombre;
import com.apaza.Tienda20.security.repository.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol>getByNombre(RolNombre rolNombre){
        return  rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }


}
