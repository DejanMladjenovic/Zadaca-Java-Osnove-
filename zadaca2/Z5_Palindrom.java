package zadaca2;

import java.util.Scanner;

/**
 * Naziv klase: Z5_Palindrom
 * 
 * Opis klase: Svrha programa je da unese od korisnika cijeli trocifreni broj.
 * Program provjerava da li je dati broj palindrom.
 * @author Dejan
 *
 */

public class Z5_Palindrom {
	/*
	 * Napisati program koji pita korisnika da unese cijeli trocifreni broj
	 *  te provjerava da li je unijeti broj palindrom. 
	 *  Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese cijeli trocifreni broj
		System.out.println("Molimo unesite cijeli trocifreni broj: ");
		int broj = unos.nextInt();
		
		//Provjeri da li je broj palindrom
		int cifra3 = broj % 10;
		
		int cifra2 = broj / 10;
		cifra2 = cifra2 % 10;
	
		int cifra1 = broj / 100;
		
		if(cifra1 == cifra3) {
			System.out.println("Broj " + broj + " je palindrom.");
		}else{
			System.out.println("Broj " + broj + " nije palindrom.");
		}
		

	}

}
