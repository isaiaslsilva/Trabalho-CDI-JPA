package br.com.vinicius.cdi.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente {

	@Id
	private int id;
	private String nome;
	private int identidade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdentidade() {
		return identidade;
	}
	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}
	
}
