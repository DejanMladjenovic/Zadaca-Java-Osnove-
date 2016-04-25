package zadaca2;

import java.util.Scanner;

/**
 * Naziv klase: Z3_ZbirNasumicnihBrojeva
 * 
 * Opis klase: Program ispisuje tri nasumicna cijela broja.
 * Korisnik treba unijeti zbir tih brojeva.
 * 
 * @author Dejan
 *
 */

public class Z3_ZbirNasumicnihBrojeva {
	/*
	 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir. 
	 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.  
	 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom. 
	 */

	public static void main(String[] args) {
		
		//Ispisi tri nasumicna cijela broja
		int broj1 = (int) (Math.random() * 10);
		int broj2 = (int) (Math.random() * 10);
		int broj3 = (int) (Math.random() * 10);
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da izracuna zbir datih brojeva
		System.out.println("Koliko je " + broj1 + " + " + broj2 + " + " + broj3 + "?");
		int zbir = unos.nextInt();
		
		int tacanZbir = broj1 + broj2 + broj3;
		
		if(zbir != tacanZbir) {
			System.out.println("Pokusajte ponovo!");
			System.out.println("Koliko je " + broj1 + " + " + broj2 + " + " + broj3 + "?");
		}else{
			System.out.println("Tacno! " + broj1 + " + " + broj2 + " + " + broj3 + " = " + tacanZbir);
		}

	}

}
