package br.com.queiroz.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "pessoa")
@Data
public class Pessoa implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Boolean ativo;
	
	@Embedded
	private Endereco endereco;

	public Pessoa(@NotNull String nome, @NotNull Boolean ativo, Endereco endereco) {
		super();
		this.nome = nome;
		this.ativo = ativo;
		this.endereco = endereco;
	}

	public Pessoa() {
	}
	
	// Evita que o hibertante e o jackson leiam como propriedade
	@JsonIgnore
	@Transient
	public boolean isInativo() {
		return !this.ativo;
	}
	
}