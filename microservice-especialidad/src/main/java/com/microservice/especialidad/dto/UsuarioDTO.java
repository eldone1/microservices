package com.microservice.especialidad.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private Long especialidadId;
}
