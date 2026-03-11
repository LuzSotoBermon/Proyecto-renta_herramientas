package com.renta_herramientas.renta_herramienta.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renta_herramientas.renta_herramienta.entities.Herramienta;


@Repository
public interface HerramientaRepository  extends CrudRepository<Herramienta,Long>{
    //Acá se deben crear los métodos que no vengan incluidos dentro de jpa(es decir métodos adicionales del Api)

    //primera forma de hacerlo por queryMethods(con el nombre del método)
    List<Herramienta> findHerramientaByPriceBetween(BigDecimal minPrice,BigDecimal maxPrice);

    //con la notación query
    @Query("SELECT p FROM Herramienta p WHERE p.price BETWEEN ?1 AND ?2") //leguaje jpql
    List<Herramienta> findHerramientaByPriceInRange(BigDecimal minPrice,BigDecimal maxPrice);
}