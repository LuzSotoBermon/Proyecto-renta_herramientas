package com.renta_herramientas.renta_herramienta.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renta_herramientas.renta_herramienta.entities.Pago;


@Repository
public interface PagoRepository extends CrudRepository<Pago,Long> {

}