package it.polito.tdp.corsi.model;

import it.polito.tdp.corsi.db.CorsoDAO;


import java.util.*;

public class Model {
	
	private CorsoDAO corsoDAO;
	
	
	public Model() {
		this.corsoDAO = new CorsoDAO();
	}
	
	
	public List<Corso> getCorsiByPeriodo(int periodo) {
		return this.corsoDAO.getCorsiByPeriodo(periodo);
	}
	
	
	public Map<Corso, Integer> getCorsiIscritti(int periodo) {
		return this.corsoDAO.getCorsiIscritti(periodo);
	}
	
	
}
