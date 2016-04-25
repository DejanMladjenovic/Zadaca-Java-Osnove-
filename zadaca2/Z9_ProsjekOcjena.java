package zadaca2;

import java.util.Scanner;

/**
 * Naziv klase: Z9_ProsjekOcjena
 * 
 * Opis klase: Svrha programa je da ucita od korisnika tri ocjene (iz tri predmeta) i da ispise prosjek ocjena.
 *  
 * @author Dejan
 *
 */

public class Z9_ProsjekOcjena {
	/*
	 * Napisati program koji uèitava od korisnika tri ocjene(iz tri predmeta) i ispisuje prosjek ocjena. 
	 * Ukoliko je jedna od ocjena 1 onda je prosjek 1 tj. ako je pao iz jednog predmeta onda se ne raèuna prosjek ocjena.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese tri ocjene iz tri razlicita programa
		System.out.println("Molimo unesite tri ocjene( iz tri predmeta): ");
		int predmet1 = unos.nextInt();
		int predmet2 = unos.nextInt();
		int predmet3 = unos.nextInt();
		
		//Izracunaj prosjek
		double prosjek =(double)(predmet1 + predmet2 + predmet3) / 3;
		
		if((predmet1 == 1) || (predmet2 == 1) || (predmet3 == 1)) {
			System.out.println("Vas prosjek je 1. Pali ste iz jednog ili vise predmeta.");
		}else{
			System.out.println("Prosjek ocjena " + predmet1 + ", " + predmet2 + " i " + predmet3 + " je " + (int)(prosjek * 100) / 100.0);
		}

	}

}
