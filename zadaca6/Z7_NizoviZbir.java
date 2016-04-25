package zadaca6;

/**
 * Naziv klase: Z7_NizoviZbir
 * 
 * Opis klase: Program ucitava od korisnika dva niza po 5 brojeva
 * i ispisuje koji niz ima veci zbir svojih clanova
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z7_NizoviZbir {
	/*
	 * Uèitati od korisnika dva niza po 5 brojeva 
	 * i ispisati koji niz ima veæi zbir èlanova.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
				
		//Pitaj korisnika da unese prvi niz brojeva
		System.out.println("Unesite prvi niz od 5 brojeva: ");
				
		//Deklarisi i kreiraj niz
		int[] niz1 = new int[5];
		
		int suma1 = 0;
		for(int i = 0; i < niz1.length; i++){
			niz1[i] = unos.nextInt();
			suma1 += niz1[i];
		}	
		//Pitaj korisnika da unese drugi niz brojeva
		System.out.println("Unesite drugi niz od 5 brojeva: ");
						
		//Deklarisi i kreiraj niz
		int[] niz2 = new int[5];
		
		int suma2 = 0;
		for(int i = 0; i < niz2.length; i++){
			niz2[i] = unos.nextInt();
			suma2 += niz2[i];
		}
		
		//Ispisi rezultat
		System.out.println("Zbir brojeva prvog niza: " + suma1);
		System.out.println("Zbir brojeva drugog niza: " + suma2);
		
		if(suma1 > suma2)
			System.out.println("Prvi niz ima veci zbir clanova.");
		else if(suma1 < suma2)
			System.out.println("Drugi niz ima veci zbir clanova.");
		else
			System.out.println("Nizovi imaju jednak zbir clanova.");

	}

}
