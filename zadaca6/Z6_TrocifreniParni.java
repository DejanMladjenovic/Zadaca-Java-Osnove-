package zadaca6;

/**
 * Naziv klase: Z6_TrocifreniParni
 * 
 * Opsi klase: Program ucitava od korisnika niz od 10 brojeva 
 * i ispisuje koliko je trocifrenih parnih brojeva u nizu
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z6_TrocifreniParni {
	/*
	 * Napisati program koji uèitava 10 brojeva od korisnika 
	 * i ispisuje koliko je trocifrenih parnih brojeva u nizu.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
				
		//Pitaj korisnika da unese 10 brojeva
		System.out.println("Unesite 10 brojeva: ");
				
		//Deklarisi i kreiraj niz
		int[] niz = new int[10];
				
		for(int i = 0; i < niz.length; i++){
			niz[i] = unos.nextInt();
		}
		
		//Izracunaj koliko ima trocifrenih parnih clanova
		int brojac = 0;
		System.out.print("Trocifreni parni brojevi: ");
		for(int i = 0; i < niz.length; i++){
			if((niz[i] % 2 == 0) && (niz[i] / 100 < 10) && (niz[i] / 100 > 0 )){
				brojac++;
				System.out.print(niz[i] + " ");
			}
		}
		
		//Ispisi rezultat
		System.out.println("\nUkupno takvih brojeva : " + brojac);
	}

}
