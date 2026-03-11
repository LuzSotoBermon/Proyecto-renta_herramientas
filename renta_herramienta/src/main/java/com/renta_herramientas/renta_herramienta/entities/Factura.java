package com.renta_herramientas.renta_herramienta.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "factura")
@Builder
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Builder.Default
    //private LocalDate fechaEmision = LocalDate.now();

    @Column(name = "fecha_emision",nullable = false)
    private LocalDate fechaEmision;
    
    //relación con pago
    @OneToOne
    @JoinColumn(name = "id_pago", unique = true)
    @JsonManagedReference
    private Pago  pagoFactura;
}




