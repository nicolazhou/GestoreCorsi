package it.polito.tdp.corsi.db;

import java.util.*;

import it.polito.tdp.corsi.model.Corso;


public class testDAO {

	public static void main(String[] args) {

		CorsoDAO dao = new CorsoDAO();
		
		List<Corso> corsi = new ArrayList<Corso>();
		
		corsi = dao.getCorsiByPeriodo(2);
		
		for(Corso c : corsi) {
			System.out.println(c);
		}
			
	}

	
}
