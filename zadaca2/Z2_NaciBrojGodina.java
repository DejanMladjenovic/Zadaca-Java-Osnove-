package zadaca2;

import java.util.Scanner;

/**
 * Naziv klase: Z2_NaciBrojGodina
 * 
 * Opis klase: Program unosi od korisnika broj minuta i pretvara ih u godine i dane
 * 
 * @author Dejan
 */

public class Z2_NaciBrojGodina {
	/*
	 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu)
	 *  te ispiše korisniku koliko je to u godinama i danima.
	 *   Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese broj minuta
		System.out.println("Molimo unesite broj minuta: ");
		int minute = unos.nextInt();
		
		//Izracunaj godine
		int godina = (365 * 24 * 60);
		int godine = minute / godina;
		
		//izracunaj dane
		int dani = ((minute % godina) / (24 * 60));
		
		//Ispisi rezultat
		System.out.println(minute + " minuta iznosi " + godine + " godina i " + dani + " dana.");


	}

}
