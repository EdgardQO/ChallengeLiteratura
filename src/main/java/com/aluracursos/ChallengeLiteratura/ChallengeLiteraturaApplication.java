package com.aluracursos.ChallengeLiteratura;

import com.aluracursos.ChallengeLiteratura.Libreria.Libreria;
import com.aluracursos.ChallengeLiteratura.repository.iAutorRepository;
import com.aluracursos.ChallengeLiteratura.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiteraturaApplication implements CommandLineRunner  {
	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteraturaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();
	}
}
