package com.renta_herramientas.renta_herramienta.controllers.dto;

import jakarta.validation.constraints.NotBlank;

public record AuthLoginRequest(String nombre,@NotBlank String username, @NotBlank String password) {

}
