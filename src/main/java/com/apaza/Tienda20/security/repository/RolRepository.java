package com.apaza.Tienda20.security.repository;

import com.apaza.Tienda20.security.entity.Rol;
import com.apaza.Tienda20.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository <Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
