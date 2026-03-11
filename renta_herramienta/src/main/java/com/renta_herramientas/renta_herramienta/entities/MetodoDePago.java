package com.renta_herramientas.renta_herramienta.entities;



import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "metodos_de_pago")
@Entity
@Builder
public class MetodoDePago {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;

    @Column(name = "metodo_de_pago")
    private String metodo;

    //relación con pago 
    @OneToMany(mappedBy = "metodoDePago",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonBackReference
    @JsonIgnore
    private List<Pago> metodosPago = new ArrayList<>();
}


