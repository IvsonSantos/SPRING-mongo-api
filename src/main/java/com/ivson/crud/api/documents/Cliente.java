package com.ivson.crud.api.documents;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cliente {

	@Id
	private String id;		// obrigatorio ter esse atributo no MONGO
	
	@NotEmpty(message = "Nome nao pode ser vazio")
	private String nome;	
	
	@NotEmpty(message = "Email nao pode ser vazio")
	@Email(message = "email invalido")
	private String email;	
	
	@NotEmpty(message = "CPF nao pode ser vazio")
	@CPF(message = "CPF Inválido")
	private String cpf;
	
	public Cliente() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
}