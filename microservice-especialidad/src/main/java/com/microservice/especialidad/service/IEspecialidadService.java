package com.microservice.especialidad.service;

import java.util.List;

import com.microservice.especialidad.entities.Especialidad;


public interface IEspecialidadService {

    List<Especialidad> findAll();

    Especialidad findById(Long id);

    void save(Especialidad especialidad);

}
