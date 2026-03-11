package com.renta_herramientas.renta_herramienta.controllers.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//se maneja como un  record  para evitar las anotaciones de getter,setter,ect

@JsonPropertyOrder({"username","message","jwt","status"}) //para decirle el order en que aparecen en el json los atributos
public record AuthReponse(String nombre ,String username,String  message, String jwt, boolean status) {

}
