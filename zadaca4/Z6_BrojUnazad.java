package zadaca4;

/**
 * Naziv klase: Z6_BrojUnazad
 * 
 * Opis klase: Program ucitava od korisnika broj
 * i ispisuje dati broj unazad
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z6_BrojUnazad {
	/*
	 * Napisati metod koji ispisuje cijeli broj naopako. Koristiti sljedeæi
	 * header: public static void reverse(int number) Primjer: reverse(3456)
	 * treba da vrati 6543
	 */
	/** Glavna metoda */
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Izbaci pitanje korisniku da unese cijeli broj
		System.out.println("Molimo unesite cijeli broj: ");
		int broj1 = unos.nextInt();

		System.out.println(reverse(broj1));

	}

	/** Vraca dati broj unazad */
	public static int reverse(int broj) {

		int rezultat = 0;
		while (broj != 0) {
			rezultat = rezultat * 10 + broj % 10;
			broj = broj / 10;
		}
		return rezultat;

	}

}
