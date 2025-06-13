package com.microservice.especialidad.service;

import java.util.List;

import com.microservice.especialidad.entities.Especialidad;
import com.microservice.especialidad.http.response.UsuarioByEspecialidadResponse;


public interface IEspecialidadService {

    List<Especialidad> findAll();

    Especialidad findById(Long id);

    void save(Especialidad especialidad);

    UsuarioByEspecialidadResponse findUsuariosByEspecialidadId(Long especialidadId);

}
