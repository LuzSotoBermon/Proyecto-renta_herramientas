package com.renta_herramientas.renta_herramienta.controllers.dto;


import java.math.BigDecimal;
import java.time.LocalDate;

import com.renta_herramientas.renta_herramienta.entities.EstadoPago;
import com.renta_herramientas.renta_herramienta.entities.Factura;
import com.renta_herramientas.renta_herramienta.entities.MetodoDePago;
import com.renta_herramientas.renta_herramienta.entities.Reserva;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagoDTO {
    
    private Long id;
    private LocalDate fechaPago;
    private BigDecimal monto;
    private MetodoDePago metodoDePago;
    private EstadoPago estadoPago;
    private Reserva reserva;
    private Factura factura;
}
