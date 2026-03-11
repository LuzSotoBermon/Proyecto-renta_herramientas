package com.renta_herramientas.renta_herramienta.controllers.dto;

import java.util.HashSet;
import java.util.Set;

import com.renta_herramientas.renta_herramienta.entities.Rol;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String username;
    private String password;
    private boolean isEnabled;
    private boolean accountNoExpired;
    private boolean accountNoLocked;
    private boolean credentialNoExpired;
    private Set<Rol> roles = new HashSet<>();
}
