package com.renta_herramientas.renta_herramienta.controllers.dto;

import java.time.LocalDate;

import com.renta_herramientas.renta_herramienta.entities.Herramienta;
import com.renta_herramientas.renta_herramienta.entities.Proveedor;
import com.renta_herramientas.renta_herramienta.entities.TipoReporte;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //lombok
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReporteDTO {
    private Long id;
    private String descripcion;
    private LocalDate fechaReporte;
    private Herramienta herramientaReporte;
    private Proveedor proveedorReporte;
    private TipoReporte tipoReporte;
}