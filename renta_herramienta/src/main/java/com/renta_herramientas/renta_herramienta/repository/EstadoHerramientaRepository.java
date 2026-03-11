package com.renta_herramientas.renta_herramienta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renta_herramientas.renta_herramienta.entities.EstadoHerramienta;
;
public interface EstadoHerramientaRepository extends JpaRepository<EstadoHerramienta, Integer> {
    // Puedes agregar métodos si se necesita
}
