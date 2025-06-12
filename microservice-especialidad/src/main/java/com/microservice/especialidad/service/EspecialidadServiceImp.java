package com.microservice.especialidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.especialidad.entities.Especialidad;
import com.microservice.especialidad.persistence.EspecialidadRepository;

@Service
public class EspecialidadServiceImp implements IEspecialidadService{

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public List<Especialidad> findAll() {
        return (List<Especialidad>) especialidadRepository.findAll();
    }

    @Override
    public Especialidad findById(Long id) {
        return especialidadRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Especialidad especialidad) {
        especialidadRepository.save(especialidad);
    }

}
