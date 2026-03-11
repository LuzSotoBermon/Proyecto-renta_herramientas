package com.renta_herramientas.renta_herramienta.repository;

import java.util.List;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renta_herramientas.renta_herramienta.entities.Rol;


@Repository
public interface RoleRepository extends CrudRepository<Rol,Integer> {

    List<Rol> findRoleEntitiesByRoleEnumIn(List<String> roleNames);
}