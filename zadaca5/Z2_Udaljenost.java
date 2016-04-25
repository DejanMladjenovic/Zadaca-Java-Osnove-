package zadaca5;

/**
 * Naziv klase: Z2_Udaljenost
 * 
 * Opis klase: Program ucitava od korisnika udaljenost dva grada u km, te brzinu dva automobila
 *  koji se krecu iz tih gradova jedan ka drugom,
 *  program izracunava vrijeme njihovog susreta i predjeni put svakog automobila
 *  
 *  @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z2_Udaljenost {
	/*
	 * Dva automobila kreæu se iz dva grada jedan prema drugom. 
	 * Korisnik unosi udaljenost izmedju gradova i brzine oba automobila. 
	 * Napisati metodu koja uzima sve te podatke, raèuna za koliko vremena æe se 
	 * automobili sresti i raèuna predjeni put svakog automobila.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku a unese udaljenost izmedju dva grada
		System.out.println("Molimo unesite udaljenost u km: ");
		double udaljenost = unos.nextInt();
		
		//Izbaci pitanje korisniku da unese brzinu prvog vozila
		System.out.println("Molimo unesite brzinu prvog vozila u km/h: ");
		double automobil1 = unos.nextInt();

		//Izbaci pitanje korisniku da unese brzinu drugog vozila
		System.out.println("Molimo unesite brzinu drugog vozila u km/h: ");
		double automobil2 = unos.nextInt();
		
		//Ispisi rezultat
		rezultat(udaljenost, automobil1, automobil2);
		
	}
	/**Racuna vrijeme susreta i predjeni put automobila*/
	public static void rezultat(double udaljenost, double automobil1, double automobil2) {
		
		double brzina = automobil1 + automobil2;
		double vrijeme = udaljenost / brzina;
		double minute = (vrijeme * 60) % 60;
		
		double putAutomobil1 = automobil1 * vrijeme;
		double putAutomobil2 = automobil2 * vrijeme;
		
		System.out.println("Automobili su se sastali za " + (int)(vrijeme) + " sati i " + (int)(minute) + " minuta.");
		System.out.println("Prvi automobil je presao " + (int)(putAutomobil1 * 100) / 100.0 
				+ "km a drugi " + (int)(putAutomobil2 * 100) / 100.0 + "km");
		
		
	}
	

}
