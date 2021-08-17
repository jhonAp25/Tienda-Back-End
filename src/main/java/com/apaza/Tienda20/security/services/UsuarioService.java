package com.apaza.Tienda20.security.services;


import com.apaza.Tienda20.security.entity.Usuario;
import com.apaza.Tienda20.security.repository.UsuarioRepository;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Value("${jwt.secret}")
    private String secret;

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }
    public void save (Usuario  usuario){
        usuarioRepository.save(usuario);
    }

    public Optional<Usuario> getUsername (String token){
      return   usuarioRepository.findByNombreUsuario( Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject());

    }
}
