package zadaca4;

/**
 * Nazv klase: Z1_Kvadrat
 * 
 * Opis klase: Program ucitava cijeli broj  od korisnika i ispisuje kvadrat tog broja
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z1_Kvadrat {
	/*
	 * Napisati metodu int kvadrat(int broj) koja ima jedan argument
	 *  i koja kao rezultat vraæa kvadrat tog argumenta.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese cijeli broj
		System.out.println("Molimo unesite jedan cijeli broj: ");
		int broj = unos.nextInt();
		
		//Ispisi rezultat
		System.out.println("Kvadrat broja " + broj + " iznosi " + kvadrat(broj) + ".");

	}
	/**Vraca kvadrat nekog broja*/
	public static int kvadrat(int a) {
		int kvadrat = a * a;
		return kvadrat;
	}

}
