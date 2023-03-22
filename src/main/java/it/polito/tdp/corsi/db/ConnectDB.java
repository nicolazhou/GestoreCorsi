package it.polito.tdp.corsi.db;

import java.sql.*;

public class ConnectDB {

	public static Connection getConnection() {
		
		String URL = "jdbc:mysql://localhost/iscritticorsi?user=root&password=root";
		
		try {
			return DriverManager.getConnection(URL);
		} catch (SQLException e) {
			System.out.println("Errore in connessione.");
			e.printStackTrace();
			return null;
		}
		
	}
	
	
}
