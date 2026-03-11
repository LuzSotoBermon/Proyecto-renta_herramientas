package com.renta_herramientas.renta_herramienta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renta_herramientas.renta_herramienta.entities.Reserva;


@Repository
public interface ReservaRepository extends CrudRepository<Reserva,Long>{

}
