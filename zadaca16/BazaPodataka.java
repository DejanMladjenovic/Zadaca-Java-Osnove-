package zadaca16;

/**
 * Naziv klase: BazaPodataka
 * 
 * @author Dejan Mladjenovic
 */

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
				+ "knjigaID INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,"
				+ "naziv VARCHAR(40),"
				+ "autor VARCHAR(40),"
				+ "godina INTEGER(4))";
		
		try (Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {
			statement.executeUpdate(query);
			System.out.println("Successfully updated the database.");
		}
	}
	
	//Unosi podatke u tabelu
	public void insert(int knjigaID, String naziv, String pisac, int godina) throws SQLException{
		final String CONN_STRING = "jdbc:mysql://localhost/biblioteka";
		String query = "INSERT INTO knjige VALUES(" + knjigaID + ", " + naziv + ", " + pisac + ", " + godina + ")";
		
		try (Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {
			
			statement.executeUpdate(query);
			System.out.println("Successfully updated the table.");
		}
	}
	
	//Prikazuje podatke u tabeli
	public void loopin() throws SQLException{
		final String CONN_STRING = "jdbc:mysql://localhost/biblioteka";
		String query = "SELECT * FROM knjige";
		ResultSet rs = null;
		
		try (Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {
			
			rs = statement.executeQuery(query);

			while (rs.next()) {
				System.out.println("Redni broj: " + rs.getInt("knjigaID")
						+ ", naziv: " + rs.getString("naziv") 
						+ ", autor: " + rs.getString("autor")
						+ ", godina: " + rs.getInt("godina"));
			}
			rs.close();
		}
	}
	
	//Brise podatke u tabeli
	public void delete(int broj) throws SQLException{
		final String CONN_STRING = "jdbc:mysql://localhost/biblioteka";
		String query = "DELETE FROM knjige WHERE knjigaID =" + broj;
		
		try (Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {

			statement.executeUpdate(query);	
			System.out.println("DELETED!");
		}
	}
	
	//Izmjenjuje podatke u tabeli
	public void update(int broj) throws SQLException{
		final String CONN_STRING = "jdbc:mysql://localhost/biblioteka";
		String query = "SELECT * FROM knjige WHERE knjigaID =" + broj;
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nKnjiga broj " + broj);
		System.out.println("Sta zelite izmijeniti(naziv, autor ili godina):");
		String d = input.nextLine();
		System.out.println("Unesite novi podatak(" + d + "):");
		String b = input.nextLine();
		
		String query1 = "UPDATE knjige SET " + d + "='" + b + "' WHERE knjigaID =" + broj;
		
		ResultSet rs = null;
		
		try (Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {
			
			statement.executeUpdate(query1);
			rs = statement.executeQuery(query);
			rs.next();
			
			System.out.println("Redni broj: " + rs.getInt("knjigaID")
					+ ", naziv: " + rs.getString("naziv") 
					+ ", autor: " + rs.getString("autor")
					+ ", godina: " + rs.getInt("godina"));
			rs.close();
		}
		input.close();
	}

}
