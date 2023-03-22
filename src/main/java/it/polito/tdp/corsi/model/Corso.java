package it.polito.tdp.corsi.model;

import java.util.Objects;

public class Corso {

	private String codins;
	private int crediti;
	private String nome;
	private int periodo;
	
	
	public Corso(String codins, int crediti, String nome, int periodo) {
		this.codins = codins;
		this.crediti = crediti;
		this.nome = nome;
		this.periodo = periodo;
	}


	public String getCodins() {
		return codins;
	}


	public int getCrediti() {
		return crediti;
	}


	public String getNome() {
		return nome;
	}


	public int getPeriodo() {
		return periodo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codins);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		return Objects.equals(codins, other.codins);
	}


	@Override
	public String toString() {
		return "Corso [codins=" + codins + ", crediti=" + crediti + ", nome=" + nome + ", periodo=" + periodo + "]";
	}
	
	
}
