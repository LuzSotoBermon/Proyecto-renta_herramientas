package com.renta_herramientas.renta_herramienta.controllers.dto;

import java.time.LocalDate;

import com.renta_herramientas.renta_herramienta.entities.Pago;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacturaDTO {
    
    private Long id;
    private LocalDate fechaEmision;
    private Pago  pagoFactura;
}
