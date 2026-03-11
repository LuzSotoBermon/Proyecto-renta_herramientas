package com.renta_herramientas.renta_herramienta.entities;


import java.util.ArrayList;
import java.util.List;

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
import jakarta.persistence.OneToMany;
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
@Table(name = "proveedor")
@Builder
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nit",length = 15,nullable = false,unique = true)
    private String nit;

    @Column(name = "nombre_empresa",length = 100,nullable = false,unique = true)
    private String empresa;

    @Column(name = "celular",length = 15,nullable = false,unique = true)
    private String telefono;

    //relacion con usuario
    @OneToOne
    @JoinColumn(name = "id_usuario") 
    @JsonManagedReference
    private Usuario usuarioProveedor;

    //Relación con herramienta
    @OneToMany(mappedBy = "proveedorHerramienta",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true )
    @JsonBackReference
    @JsonIgnore //->anotación para serealizar la lista cuando se pida en la petición. 
    private List<Herramienta> listHerramientas = new ArrayList<>();

    //relación con reporte
    @OneToMany(mappedBy = "proveedorReporte", cascade = CascadeType.ALL)
    @JsonBackReference
    @JsonIgnore
    private List<Reporte> reportes = new ArrayList<>();
}



