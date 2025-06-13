package com.microservice.especialidad.http.response;

import java.util.List;

import com.microservice.especialidad.dto.UsuarioDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioByEspecialidadResponse {

    private String nombreEspecialidad;
    private List<UsuarioDTO> usuarioDTOList;

}
