package zadaca18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Knjiga {

	int broj;
	String imeAutora;
	String prezimeAutora;
	String naslov;
	int brojStranica;
	String izdavac;
	String imeClana;
	
//	private static final String USERNAME = "root";
//	private static final String PASSWORD = "";
//	private static final String CONN_STRING = "jdbc:mysql://localhost/biblioteka";
	
	public Knjiga(int broj, String imeAutora, String prezimeAutora, String naslov, int brojStranica, String izdavac,
			String imeClana){
		this.broj = broj;
		this.imeAutora = imeAutora;
		this.prezimeAutora = prezimeAutora;
		this.naslov = naslov;
		this.brojStranica = brojStranica;
		this.izdavac = izdavac;
		this.imeClana = imeClana;
		
	}
	
	public Knjiga(String imeAutora, String prezimeAutora, String naslov, int brojStranica, String izdavac){
		this.imeAutora = imeAutora;
		this.prezimeAutora = prezimeAutora;
		this.naslov = naslov;
		this.brojStranica = brojStranica;
		this.izdavac = izdavac;
	}

	
	public Knjiga() {
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getImeAutora() {
		return imeAutora;
	}

	public void setImeAutora(String imeAutora) {
		this.imeAutora = imeAutora;
	}

	public String getPrezimeAutora() {
		return prezimeAutora;
	}

	public void setPrezimeAutora(String prezimeAutora) {
		this.prezimeAutora = prezimeAutora;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public int getBrojStranica() {
		return brojStranica;
	}

	public void setBrojStranica(int brojStranica) {
		this.brojStranica = brojStranica;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public String getImeClana() {
		return imeClana;
	}

	public void setImeClana(String imeClana) {
		this.imeClana = imeClana;
	}	
}
	