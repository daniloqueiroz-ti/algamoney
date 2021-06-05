package br.com.queiroz.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Categoria implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank(message = "O campo nome não pode ser vazio.")
	@Size(min = 3, max = 50)
	private String nome;

	public Categoria(@NotBlank(message = "O campo nome não pode ser vazio.") @Size(min = 3, max = 50) String nome) {
		this.nome = nome;
	}

	public Categoria() {
	}
	
}
