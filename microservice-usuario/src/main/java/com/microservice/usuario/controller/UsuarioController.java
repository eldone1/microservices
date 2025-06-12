package com.microservice.usuario.controller;

import org.springframework.web.bind.annotation.RestController;

import com.microservice.usuario.entities.RolUsuario;
import com.microservice.usuario.entities.Usuario;
import com.microservice.usuario.service.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUsuario(@RequestBody Usuario usuario){
        usuarioService.save(usuario);

    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllUsuarios(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @GetMapping("/doctores")
    public ResponseEntity<?> obtenerDoctores() {
        return ResponseEntity.ok(usuarioService.findByRol(RolUsuario.DOCTOR));
    }

    @GetMapping("/pacientes")
    public ResponseEntity<?> obtenerPacientes() {
        return ResponseEntity.ok(usuarioService.findByRol(RolUsuario.PACIENTE));
    }

}
