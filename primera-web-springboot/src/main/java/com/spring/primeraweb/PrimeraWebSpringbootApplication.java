package com.spring.primeraweb;

import com.spring.primeraweb.entities.Persona;
import com.spring.primeraweb.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication {
@Autowired
public PersonaRepository personaRepository;
	public static void main(String[] args) {

		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);
	}
	/*
@Override
	public void run(String...args)throws Exception{
		personaRepository.save(new Persona(1L,"Carla",28));
		personaRepository.save(new Persona(2L,"Denisse",29));
		personaRepository.save(new Persona(3L,"Pablo",35));
		personaRepository.save(new Persona(4L,"Diego",30));
		personaRepository.save(new Persona(5L,"Ismael",36));
		System.out.println("Numero de personas en la tabla: "+ personaRepository.count());
		List<Persona>personas=personaRepository.findAll();
		personas.forEach(p -> System.out.println("Nombre de la persona: "+p.getNombre()));
}
*/
}
