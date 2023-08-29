package com.utn.ejer1.repositories;

import com.utn.ejer1.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona,Long> {
}
