package it.polito.tdp.corsi.db;

import java.util.*;
import java.sql.*;

import it.polito.tdp.corsi.model.Corso;

public class CorsoDAO {
	
	
	public List<Corso> getCorsiByPeriodo(int periodo) {
		
		String sql = "SELECT * "
				+ "FROM corso "
				+ "WHERE pd = ?";
		
		List<Corso> resultCorso = new ArrayList<Corso>();
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1, periodo);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				
				Corso c = new Corso(rs.getString("codins"), rs.getInt("crediti"), rs.getString("nome"), rs.getInt("pd"));
				
				resultCorso.add(c);
				
			}
			
			st.close();
			rs.close();
			conn.close();
			
			return resultCorso;
			
			
		} catch (SQLException e) {
			System.out.println("Error in Corso DAO");
			e.printStackTrace();
			
			return null;
		}
		
	}
	
	
	public Map<Corso, Integer> getCorsiIscritti(int periodo) {
		
		String sql = "SELECT c.codins, c.crediti, c.nome, c.pd, COUNT(*) AS n "
				+ "FROM corso c, iscrizione i "
				+ "WHERE c.codins = i.codins and c.pd = ? "
				+ "GROUP BY c.codins, c.crediti, c.nome, c.pd";
		
		Map<Corso, Integer> result = new HashMap<Corso, Integer>();
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1, periodo);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				
				Corso c = new Corso(rs.getString("codins"), rs.getInt("crediti"), rs.getString("nome"), rs.getInt("pd"));
				
				result.put(c, rs.getInt("n"));
				
			}
			
			st.close();
			rs.close();
			conn.close();
			
			return result;
			
		} catch (SQLException e) {
			System.out.println("Error in Corso DAO");
			e.printStackTrace();
			
			return null;
		}
		
	}
	
	
}
