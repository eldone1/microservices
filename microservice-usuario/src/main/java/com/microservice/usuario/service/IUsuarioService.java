package com.microservice.usuario.service;

import java.util.List;

import com.microservice.usuario.entities.RolUsuario;
import com.microservice.usuario.entities.Usuario;

public interface IUsuarioService {

    List<Usuario> findAll();

    Usuario findById(Long id);

    void save(Usuario usuario);

    List<Usuario> findByRol(RolUsuario rol);

    List<Usuario> findByIdEspecialidad(Long especialidadId);
}
