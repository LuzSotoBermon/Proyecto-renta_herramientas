package com.renta_herramientas.renta_herramienta.controllers.dto;

import java.time.LocalDate;

import com.renta_herramientas.renta_herramienta.entities.Cliente;
import com.renta_herramientas.renta_herramienta.entities.EstadoReserva;
import com.renta_herramientas.renta_herramienta.entities.Herramienta;
import com.renta_herramientas.renta_herramienta.entities.Pago;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservaDTO {
   
    private Long id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private EstadoReserva estadoReserva;
    private Herramienta herramientaReserva;
    private Cliente cliente;
    private Pago pago;
}