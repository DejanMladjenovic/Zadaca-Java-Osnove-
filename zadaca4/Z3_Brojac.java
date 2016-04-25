package zadaca4;

/**
 * Naziv klase: Z3_Brojac
 * 
 * Opis klase: Program ucitava od korisnika cijeli broj
 *  i ispisuje sve brojeve od 1 do tog broja 
 *  
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z3_Brojac {
	/*
	 * Napisati metodu koja ima jedan argument(cijeli broj) i koja ispisuje sve brojeve od 1 do tog broja.
	 */
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Krieraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unesecijeli broj
		System.out.println("Molimo unesite jedan cijeli broj: ");
		int broj = unos.nextInt();
		
		//Ispisi rezultat
		brojac(broj);

	}
	/**Vraca brojeve od 1 do datog broja*/
	public static int brojac(int a) {
		
		int brojac = 1;
		while(brojac <= a) {
			System.out.println(brojac);
			brojac++;
		}
		return brojac;
	}

}
