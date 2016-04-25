package zadaca6;

/**
 * Naziv klase: Z2_Kvadrat
 * 
 * Opis klase: Program ucitava od korisnika niz od 10 brojeva
 * i ispisuje da li je kvadrat prvog broja veci od zbira svih ostalih brojeva
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z2_Kvadrat {
	/*
	 * Napisati program koji uèitava deset brojeva i ispisuje 
	 *  da li je kvadrat prvog unesenog broja veæi od zbira svih ostalih brojeva.
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
		
		//Izracunaj kvadrat prvog clana i zbir svih ostalih clanova
		int kvadrat = niz[0] * niz[0];
		int suma = 0;
		for(int i = 1; i < niz.length; i++){
			suma += niz[i];
			
		}
		
		//Ispisi rezultat
		System.out.println("Kvadrat prvog unesenog broja iznosi: " + kvadrat);
		System.out.println("Zbir ostalih brojeva iznosi: " + suma);
		
		if(kvadrat > suma){
			System.out.println("Kvadrat prvog unesenog broja je veci od zbira svih ostalih brojeva. ");
		}else if(kvadrat < suma){
			System.out.println("Kvadrat prvog unesenog broja je manji od zbira svih ostalih brojeva. ");
		}else{
			System.out.println("Kvadrat prvog unesenog broja jednak je zbiru svih ostalih brojeva.");
		}
	}

}
