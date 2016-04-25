package zadaca2;

import java.util.Scanner;

/**
 * Naziv klase: PozituvniBrojevi
 * 
 * Opis klase: Svrha programa je da unese od korisnika dva cijela broja.
 * Program ispisuje da li su oba broja pozitivna.
 * 
 * @author Dejan
 *
 */

public class Z7_PozitivniBrojevi {
	/*
	 * Napisati program koji uèitava od korisnika dva cijela broja
	 *  i ispisuje da li su oba broja pozitivna.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese dva cijela broja
		System.out.println("Molimo unesite dva cijela  broja: ");
		int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();
		
		if((broj1 >= 0) && (broj2) >= 0) {
			System.out.println("Brojevi " + broj1 + " i " + broj2 + " su pozitivni." );			
		}else{
			System.out.println("Oba broja ili jedan od brojeva " + broj1 + " i " + broj2 + " nije pozitivan.");
		}
	}

}
