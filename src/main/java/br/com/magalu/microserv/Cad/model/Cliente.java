package br.com.magalu.microserv.Cad.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Cliente extends AbstractPersistable<Long>{	
	@NotBlank
	private String nome;
	
	@NotBlank
	@Email
	private String email;

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
}
