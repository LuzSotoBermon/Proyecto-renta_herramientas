package com.renta_herramientas.renta_herramienta.entities;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotBlank;
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
@Table(name = "herramienta")
@Builder
public class Herramienta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column(name = "nombre",length = 100,nullable = false)
    private String nombre;

    
    @Column(name = "descripcion",nullable = false)
    private String descripcion;

    @Column(name = "costo_alquiler_dia",nullable = false)
    private BigDecimal price;

    @Column(name = "url_img",length = 400,nullable = false)
    private String imagen;

    @Column(name = "stock",nullable = false)
    private Integer stock;
    //Relación Estado Herramienta
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_estado_herramienta") 
    private EstadoHerramienta estadoHerramienta;

    //Relación con proveedor
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "id_proveedor",nullable = false)
    @JsonIgnore
    private Proveedor proveedorHerramienta;

    //relación con reserva
    @OneToMany(mappedBy = "herramientaReserva", cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonBackReference
    @JsonIgnore
    private List<Reserva> reservas = new ArrayList<>();

    //relacion con reporte
    @OneToMany(mappedBy = "herramientaReporte", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    @JsonIgnore
    private List<Reporte> reportes = new ArrayList<>();
    
}



