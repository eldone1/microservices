package com.microservice.especialidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.especialidad.client.UsuarioClient;
import com.microservice.especialidad.dto.UsuarioDTO;
import com.microservice.especialidad.entities.Especialidad;
import com.microservice.especialidad.http.response.UsuarioByEspecialidadResponse;
import com.microservice.especialidad.persistence.EspecialidadRepository;

@Service
public class EspecialidadServiceImp implements IEspecialidadService{

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Autowired
    private UsuarioClient usuarioClient;
    
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

    @Override
    public UsuarioByEspecialidadResponse findUsuariosByEspecialidadId(Long especialidadId) {

        //Buscar especialidad
        Especialidad especialidad = especialidadRepository.findById(especialidadId).orElse(new Especialidad());

        //Obtener los usuarios
        List<UsuarioDTO> usuarioDTOList = usuarioClient.findAllUsuariosByEspecialidad(especialidadId);

        return UsuarioByEspecialidadResponse.builder()
            .nombreEspecialidad(especialidad.getNombre())
            .usuarioDTOList(usuarioDTOList)
            .build();
    }

}
