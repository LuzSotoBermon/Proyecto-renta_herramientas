package com.renta_herramientas.renta_herramienta.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renta_herramientas.renta_herramienta.entities.Cliente;



@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long> {

    @Transactional
    @Modifying
    @Query("UPDATE Cliente c SET c.direccion = :direccion, c.telefono = :telefono WHERE c.cedula = :cedula")
    void actualizarPorCedula(@Param("direccion") String direccion,
                             @Param("telefono") String telefono,
                             @Param("cedula") String cedula);
}
