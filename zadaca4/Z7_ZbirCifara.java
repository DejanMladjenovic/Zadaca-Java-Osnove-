package zadaca4;

/**
 * Naziv klase: Z7_ZbirCifara
 * 
 * Opis klase: Program ucitava od korisnika broj, sabira cifre tog broja 
 * i ispisuje zbir cifara datog broja
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z7_ZbirCifara {
	/*
	 * Napisati metod koji sabira sve cifre cijelog broja. Koristiti sljedeæi
	 * header: public static int sumDigits(long n) Primjer: sumDigits(234) treba
	 * da vrati 9. (2+3+4 = 9)
	 */
	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Izbaci pitanje korisniku da unese cijeli broj
		System.out.println("Molimo unesite cijeli broj: ");
		int broj = unos.nextInt();
		
		//Ispisi rezultat
		System.out.println(sumDigits(broj));

	}
	/**Vraca zbir cifara nekog broja*/
	public static int sumDigits(long n) {
		int rezultat = 0;
		while (n != 0) {
			rezultat += n % 10;
			n /= 10;
		}
		return rezultat;
		
	}

}
