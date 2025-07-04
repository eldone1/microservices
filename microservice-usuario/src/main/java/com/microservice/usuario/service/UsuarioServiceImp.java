package com.microservice.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.usuario.entities.RolUsuario;
import com.microservice.usuario.entities.Usuario;
import com.microservice.usuario.persistence.UsuarioRepository;

@Service
public class UsuarioServiceImp implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
       return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> findByRol(RolUsuario rol) {
        return usuarioRepository.findByRol(rol);
    }

    @Override
    public List<Usuario> findByIdEspecialidad(Long especialidadId) {
        return usuarioRepository.findAllByEspecialidadId(especialidadId);
    }


}
