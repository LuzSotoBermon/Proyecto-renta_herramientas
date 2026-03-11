package com.renta_herramientas.renta_herramienta.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renta_herramientas.renta_herramienta.entities.Usuario;


@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario,Long>{ //Clase referencia y tipo de dato de la llaver primaria 

    Optional<Usuario> findByUsername(String email); //query method de jpa para buscar usuario por el email

    //Método con @Query
    // @Query("SELECT u FROM Usuario u WHERE u.email = ?")
    // Optional<Usuario> findUser(String email);

    void deleteByUsername(String username);
}