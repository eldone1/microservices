package com.microservice.especialidad.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.especialidad.dto.UsuarioDTO;

@FeignClient(name = "mcsv-usuario", url = "localhost:8090/api/usuario")
public interface UsuarioClient {

    @GetMapping("/search-by-especialidad/{especialidadId}")
    List<UsuarioDTO> findAllUsuariosByEspecialidad(@PathVariable Long especialidadId);
}
