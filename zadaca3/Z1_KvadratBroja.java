package zadaca3;

import java.util.Scanner;

/**
 * Naziv klase: Z1_KvadratBroja
 * 
 * Opis klase: Program ispisuje nasumican broj. Korisnik treba unijeti kvadrat
 * datog broja. Ukoliko je odgovor netacan program se ponovo ispisuje dok
 * korisnik ne unese tacan odgovor.
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z1_KvadratBroja {
	/*
	 * Prikazati sluèajan broj korisniku i tražiti da upiše kvadrat tog broja.
	 * Ponavljati zahtjev dok korisnik ne upiše taèan kvadrat broja.
	 */

	public static void main(String[] args) {
		// Generisi nasumican cijeli broj od 1 do 10
		int broj = (int) (Math.random() * 10);
		int kvadrat = broj * broj;
		
		// Ispisi pitanje korisniku da unese kvadrat datog broja
		System.out.println("Koliki je kvadrat broja " + broj + "?");

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		int odgovor = 0;

		// Ispisi rezultat. Ukoliko je odgovor netacan uvedi korisnika u petlju,
		// dok ne ispise tacan rezultat
		while (odgovor != kvadrat) {
			odgovor = unos.nextInt();

			if (odgovor == kvadrat) {
				System.out.println("Bravo. Kvadrat broja " + broj + " jeste "
						+ odgovor + ".");
			} else if (odgovor > kvadrat) {
				System.out.println("Pokusajte ponovo. Kvadrat broja " + broj
						+ " je manji od " + odgovor + ".");
			} else {
				System.out.println("Pokusajte ponovo. Kvadrat broja " + broj
						+ " je veci od " + odgovor + ".");
			}

		}

	}

}
