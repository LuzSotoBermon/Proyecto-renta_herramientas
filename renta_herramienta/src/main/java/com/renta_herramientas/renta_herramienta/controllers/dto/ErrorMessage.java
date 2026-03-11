package com.renta_herramientas.renta_herramienta.controllers.dto;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage { //plantilla para la respuesta de la excepción 
    private HttpStatus status;
    private String message;
}
