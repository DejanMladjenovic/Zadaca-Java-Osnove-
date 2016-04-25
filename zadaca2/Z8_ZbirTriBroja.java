package zadaca2;

import java.util.Scanner;

/**
 * Naziv klase: Z8_ZbirTriBroja
 * 
 * Opis klase: Program ucitava od korisnika tri cijela broja
 *  i ispisuje da li je zbir tih brojeva paran
 *  
 * @author Dejan
 *
 */

public class Z8_ZbirTriBroja {
	/*
	 * Napisati program koji uèitava od korisnika tri cijela broja
	 *  i ispisuje da li je zbir brojeva paran broj.
	 */


	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese tri cijela broja
		System.out.println("Molimo unesite tri cijela broja: ");
		int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();
		int broj3 = unos.nextInt();
		
		if( (broj1 + broj2 + broj3) % 2 ==0) {
			System.out.println("Zbir brojeva " + broj1 + ", " + broj2 + " i " + broj3 + " je paran broj.");
		}else{
			System.out.println("Zbir brojeva " + broj1 + ", " + broj2 + " i " + broj3 + " nije paran broj.");

			
		}
		
		
	}

}
