package com.microservice.especialidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.especialidad.entities.Especialidad;
import com.microservice.especialidad.service.IEspecialidadService;


@RestController
@RequestMapping("/api/especialidad")
public class EspecialidadController {

    @Autowired
    private IEspecialidadService especialidadService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUsuario(@RequestBody Especialidad especialidad){
        especialidadService.save(especialidad);

    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllEspecialidad(){
        return ResponseEntity.ok(especialidadService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(especialidadService.findById(id));
    }

    @GetMapping("/search-usuario/{especialidadId}")
    public ResponseEntity<?> findUsuariosByEspecialidadId(@PathVariable Long especialidadId){
        return ResponseEntity.ok(especialidadService.findUsuariosByEspecialidadId(especialidadId));
    }



}
