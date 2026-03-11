package com.renta_herramientas.renta_herramienta.controllers.dto;


import java.util.List;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Size;


@Validated 
public record AuthCreateRoleRequest( @Size(max = 1,message = "El usuario no puede tener más de un rol") List<String> roleListName) {
    
}



