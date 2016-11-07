package br;

import java.sql.Connection;
import java.sql.DriverManager;

public class TesteJDBC {

	public TesteJDBC() {
		connect();
	}
	
	private void connect() {
		String path = "jdbc:mysql://localhost:3306/seubanco";
		String user = "root";
		String pass = "";
		
		try {
			Connection c = DriverManager.getConnection(path, user, pass);
			System.out.println("Conectado!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
