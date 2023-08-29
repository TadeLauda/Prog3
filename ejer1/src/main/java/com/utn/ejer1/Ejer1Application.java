package com.utn.ejer1;

import com.utn.ejer1.entities.Persona;
import com.utn.ejer1.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejer1Application {

	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {

		SpringApplication.run(Ejer1Application.class, args);
		System.out.println("Estoy funcionando");
	}

	@Bean
	CommandLineRunner init(PersonaRepository personaRepo) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");
			Persona persona = new Persona();
			persona.setNombre("Juan");
			persona.setApellido("Pérez");
			persona.setEdad(30);

			// Guardar el objeto Persona en la base de datos
//        PersonaRepository personaRepository = context.getBean(PersonaRepository.class);
			personaRepository.save(persona);
			personaRepo.save(persona);

			personaRepository.findById(persona.getId());

			// Recuperar el objeto Persona desde la base de datos
			Persona personaRecuperada = personaRepo.findById(persona.getId()).orElse(null);
			if (personaRecuperada != null) {
				System.out.println("Nombre: " + personaRecuperada.getNombre());
				System.out.println("Apellido: " + personaRecuperada.getApellido());
				System.out.println("Edad: " + personaRecuperada.getEdad());
			}

		};

	}


}
