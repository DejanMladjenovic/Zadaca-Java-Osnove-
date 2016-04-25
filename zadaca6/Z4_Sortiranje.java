package zadaca6;

/**
 * Naziv klase: Z3_ Sortiranje
 * 
 * Opis klase: Program ucitava od korisnika niz od 10 brojeva
 * i ispisuje sve brojeve koji su veci od prethodnog a manji od narednog clana niza
 * 
 *@author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z4_Sortiranje {
	/*
	 * Napisati program koji uèitava od korisnika 10 brojeva u niz 
	 * i ispisuje sve brojeve koji su veci od prethodnog, a manji od narednog èlana niza.
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
		
		int a = 0;
		for(int j = 0; j < niz.length; j++){
		for(int i = 0; i < niz.length - 1; i++){
			if(niz[i] > niz[i + 1]){
				a = niz[i];
				niz[i] = niz[i + 1];
				niz[i+1] = a;
			}
			
		}
		}
		//Ispisi rezultat
		for(int i = 0; i < niz.length; i++){
			System.out.println(niz[i]);
		}
	
		

	}

}
