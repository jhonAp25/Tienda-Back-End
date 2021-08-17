package com.apaza.Tienda20.util.created;



import com.apaza.Tienda20.security.entity.Rol;
import com.apaza.Tienda20.security.entity.Usuario;
import com.apaza.Tienda20.security.enums.RolNombre;
import com.apaza.Tienda20.security.services.RolService;
import com.apaza.Tienda20.security.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;


@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
        public void run(String... args) throws Exception {
            Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
            Rol rolUser = new Rol(RolNombre.ROLE_USER);
            rolService.save(rolAdmin);
            rolService.save(rolUser);

            Set<Rol> roles = new HashSet<>();
            roles.add(rolAdmin);
            roles.add(rolUser);

        Usuario user = new Usuario();

        Usuario usuario = new Usuario();
        usuario.setNombre("JHON APAZA");
        usuario.setNombreUsuario("JhonAp23");
        usuario.setEmail("jhon1@gmail.com");
        usuario.setPassword(passwordEncoder.encode("123"));
        usuario.setRoles(roles);



        usuario.setNombre("JHON APAZA");
        usuario.setNombreUsuario("JhonAp23");
        usuario.setEmail("jhon1@gmail.com");
        usuario.setPassword(passwordEncoder.encode("123"));
        usuario.setRoles(roles);

        usuarioService.save(usuario);

    }


}
