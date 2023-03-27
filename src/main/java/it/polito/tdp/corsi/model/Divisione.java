package it.polito.tdp.corsi.model;

public class Divisione {

	String CDS;
	int nStudenti;
	
	
	public Divisione(String CDS, int nStudenti) {
		this.CDS = CDS;
		this.nStudenti = nStudenti;
	}


	public String getCDS() {
		return CDS;
	}


	public int getnStudenti() {
		return nStudenti;
	}


	
	@Override
	public String toString() {
		return this.CDS + " = " + this.nStudenti;
	}
	
	
}
