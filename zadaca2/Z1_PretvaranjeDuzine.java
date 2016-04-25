package zadaca2;

import java.util.Scanner;

/**
 * Naziv klase: Z1_PretvaranjeDuzine
 * 
 * Opis klase: Program ucitava duzinu u stopama i pretvara duzinu u metre
 * 
 * @author Dejan
 */

public class Z1_PretvaranjeDuzine {
	/*
	 * Napisati program koji ucitava broj stopa,
	 * konvertuje ih u metre te ispisuje rezultat.
	 * 1 stopa = 0.305 metara
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese broj stopa
		System.out.println("Molimo unesite broj stopa: ");
		double stopa = unos.nextDouble();
		
		//Pretvori stope u metre
		double metar = stopa * 0.305;
		
		//Ispisi rezultat
		System.out.println(stopa + " stopa iznosi " + metar + " metara.");

	}

}
