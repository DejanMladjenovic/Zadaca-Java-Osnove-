package zadaca18;
	
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

	public class BazaPodataka {
		
		private static final String USERNAME = "root";
		private static final String PASSWORD = "";
		private static final String CONN_STRING = "jdbc:mysql://localhost";
		
		
		//Kreira bazu podataka
		public void baza() throws SQLException{
			String query = "CREATE DATABASE biblioteka";
			
			try (Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
					Statement statement = connection.createStatement();) {
				
				statement.executeUpdate(query);
				System.out.println("Successfully created the database.");
			}
		}
		
		//Kreira tabelu
		public void tabela() throws SQLException {
			final String CONN_STRING = "jdbc:mysql://localhost/biblioteka";
			String query = "CREATE TABLE knjige (" 
					+ "broj INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,"
					+ "imeAutora VARCHAR(40),"
					+ "prezimeAutora VARCHAR(40),"
					+ "naslov VARCHAR(40),"
					+ "brojStranica INTEGER(4),"
					+ "izdavac VARCHAR(40),"
					+ "imeClana VARCHAR(40))";
			
			try (Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
					Statement statement = connection.createStatement();) {
				statement.executeUpdate(query);
				System.out.println("Successfully updated the database.");
			}
		}

}
