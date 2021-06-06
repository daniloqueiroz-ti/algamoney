package br.com.queiroz.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	
	public Endereco(String logradouro, String numero, String complemento, String bairro, String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}
	
	public Endereco() {
		
	}
	
}