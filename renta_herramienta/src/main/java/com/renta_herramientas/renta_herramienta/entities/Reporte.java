package com.renta_herramientas.renta_herramienta.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reporte")
@Builder
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion",length = 200,nullable = false)
    private String descripcion;

    @Column(name = "fecha_reporte",nullable = false)
    private LocalDate fechaReporte;

    //relacion con herramienta 
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_herramienta")
    @JsonIgnore
    private Herramienta herramientaReporte;

    //relacion con proveedor
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_proveedor")
    @JsonIgnore
    private Proveedor proveedorReporte;

    //relacion con tipo reporte 
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_tipo_reporte")
    @JsonIgnore
    private TipoReporte tipoReporte;


}




