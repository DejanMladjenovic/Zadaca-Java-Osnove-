package zadaca9;

import java.util.Scanner;

/**
 * Naziv klase: Z2_TestKlub
 * 
 * Opis klase: Program ucitava od korisnika podatke od 5 klubova i ispisuje
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z2_TestKlub {
	/*
	 * Koristeæi klasu iz prvog zadatka, uèitati od korisnika podatke za 
	 * 5 klubova(ime, brojPobjeda, brojPoraza, brojNerjesenih, primljeniGolovi i postignutiGolovi), 
	 * napraviti 5 objekata, postaviti ih u niz. 
	 * Ispisati za svaki klub koliko je odigrao utakmica, koliko ima bodova i kolika mu je gol razlika.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj i deklarisi niz od 5 objekata
		Z1_Klub[] nizKlub = new Z1_Klub[5];

		for(int i = 0; i < nizKlub.length; i++){
			nizKlub[i] = new Z1_Klub();
			System.out.println("Klub " + (i + 1));
			System.out.println("Unesite naziv kluba: ");
			nizKlub[i].ime = unos.next();
			System.out.println("Unesite broj pobjeda: ");
			nizKlub[i].brojPobjeda = unos.nextInt();
			System.out.println("Unesite broj poraza: ");
			nizKlub[i].brojPoraza = unos.nextInt();
			System.out.println("Unesite broj nerijesenih: ");
  			nizKlub[i].brojNerijesenih = unos.nextInt();
			System.out.println("Unesite broj primljenih golova: ");
			nizKlub[i].primljeniGolovi = unos.nextInt();
			System.out.println("Unesite broj postignutih golova: ");
			nizKlub[i].postignutiGolovi = unos.nextInt();
			System.out.println();
			
		}
		
		//Ispisi rezultate
		for(int i = 0; i < nizKlub.length; i++){
			System.out.println("Ime kluba: " + nizKlub[i].ime);
			System.out.println("Odigranih utakmica: " + nizKlub[i].ukupnoUtakmica());
			System.out.println("Gol razlika: " + nizKlub[i].golRazlika());
			System.out.println();
		}

	}

}
