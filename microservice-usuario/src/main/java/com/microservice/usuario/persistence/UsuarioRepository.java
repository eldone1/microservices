package com.microservice.usuario.persistence;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.usuario.entities.RolUsuario;
import com.microservice.usuario.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    List<Usuario> findByRol(RolUsuario rol);

    Optional<Usuario> findByUsername(String username);

}
