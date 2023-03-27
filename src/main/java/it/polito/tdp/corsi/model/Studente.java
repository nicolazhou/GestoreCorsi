package it.polito.tdp.corsi.model;

public class Studente {

	private int matricola;
	private String cognome;
	private String nome;
	private String CDS;
	
	
	public Studente(int matricola, String cognome, String nome, String CDS) {
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
		this.CDS = CDS;
	}

	
	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCDS() {
		return CDS;
	}

	public void setCDS(String cDS) {
		CDS = cDS;
	}
	
	
	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", cognome=" + cognome + ", nome=" + nome + ", CDS=" + CDS + "]";
	}
	
	
}
