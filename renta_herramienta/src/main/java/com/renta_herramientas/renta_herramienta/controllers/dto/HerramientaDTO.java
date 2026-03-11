package com.renta_herramientas.renta_herramienta.controllers.dto;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HerramientaDTO {

    //Las validaciones con anaotaciones se hacen en el DTO, no en la entidad directamente. 

    //Se puede usar el not null para validar el id
    private Long id;

    @NotBlank(message = "Por favor ingresa el nombre") //para validar el ingreso del nombre
    private String nombre;

    @Length(min = 10,max = 50) //validacion del rango de caracteres 
    private String descripcion;

    private BigDecimal price;
    private String imagen;
    private Integer stock;
    private Integer estadoHerramienta;
    private Long proveedorHerramienta;
}