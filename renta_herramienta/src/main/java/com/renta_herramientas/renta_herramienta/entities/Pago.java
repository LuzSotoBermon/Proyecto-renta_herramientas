package com.renta_herramientas.renta_herramienta.entities;



import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "pago")
@Builder
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_de_pago",nullable = false)
    private LocalDate fechaPago;

    @Column(name = "monto",nullable = false)
    private BigDecimal monto;
    
    //relacion con método de pago
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_metodo_pago") 
    @JsonIgnore
    private MetodoDePago metodoDePago;

    //relacion con estado pago 
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_estado_pago") 
    @JsonIgnore
    private EstadoPago estadoPago;

    //relación con reserva
    @OneToOne
    @JoinColumn(name = "id_reserva", unique = true)
    @JsonManagedReference
    private Reserva reserva;

    //relación con factura
    @OneToOne(mappedBy = "pagoFactura", cascade = CascadeType.ALL)
    @JsonBackReference
    private Factura factura;
}


