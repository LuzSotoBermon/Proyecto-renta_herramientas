package com.renta_herramientas.renta_herramienta.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDTO {
    
    private Long id;
    private String cedula;
    private String direccion;
    private String telefono;
}
