package br.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudante")
public class Estudante {
	
	@Id
	@Column(name="codigo")
	private int cod;

	@Column(name="nome_completo")
	private String nomeCompleto;

	@Column(name="email")
	private String email;
	
	public Estudante() { }
	
	public Estudante(String nomeCompleto, String email) {
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}
	
	public int getCod() { return cod; }
	public void setCod(int cod) { this.cod = cod; }
	public String getNomeCompleto() { return nomeCompleto; }
	public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	@Override
	public String toString() {
		return "Estudante [cod=" + cod + ", nomeCompleto=" + nomeCompleto + ", email=" + email + "]";
	}
}


