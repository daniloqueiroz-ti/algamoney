package br.com.queiroz;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.queiroz.model.Categoria;
import br.com.queiroz.repository.CategoriaRepository;

@SpringBootApplication
public class AlgamoneyApiApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyApiApplication.class, args);
	}
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria categoria1 = new Categoria("Lazer");
		Categoria categoria2 = new Categoria("Alimentação");
		Categoria categoria3 = new Categoria("Supermercado");
		Categoria categoria4 = new Categoria("Farmácia");
		Categoria categoria5 = new Categoria("Outros");
		
		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3, categoria4, categoria5));
		
	}

}
