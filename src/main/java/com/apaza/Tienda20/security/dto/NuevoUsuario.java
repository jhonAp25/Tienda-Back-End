package com.apaza.Tienda20.security.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
public class NuevoUsuario {

    private String  nombre ;
    private String nombreUsuario ;

    private String email;
    private String password;
    private Set<String> roles = new HashSet<>();


}
