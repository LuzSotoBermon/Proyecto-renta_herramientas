package com.renta_herramientas.renta_herramienta.controllers.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record  AuthCreateUserRequest(@NotBlank String nombre ,@NotBlank String username, @NotBlank String password, @Valid AuthCreateRoleRequest roleRequest) {

}

