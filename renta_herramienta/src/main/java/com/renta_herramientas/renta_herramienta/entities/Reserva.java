package com.renta_herramientas.renta_herramienta.entities;


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
@Table(name = "reserva")
@Builder
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_inicio",nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin",nullable = false)
    private LocalDate fechaFin;
    
    //relación con  estado_reserva
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_estado")
    @JsonIgnore
    private EstadoReserva estadoReserva;
    
    //relacion con herramienta
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_herramienta")
    @JsonIgnore
    private Herramienta herramientaReserva;

    //relacion con cliente
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_cliente")
    @JsonIgnore
    private Cliente cliente;

    //relación con pago
    @OneToOne(mappedBy = "reserva", cascade = CascadeType.ALL)
    @JsonBackReference
    private Pago pago;
}




