package com.utn.ejer2.repositories;

import com.utn.ejer2.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona , Long> {
}
