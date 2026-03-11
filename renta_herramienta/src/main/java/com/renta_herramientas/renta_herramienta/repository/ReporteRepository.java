package com.renta_herramientas.renta_herramienta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renta_herramientas.renta_herramienta.entities.Reporte;


@Repository
public interface ReporteRepository  extends CrudRepository<Reporte,Long>{

}