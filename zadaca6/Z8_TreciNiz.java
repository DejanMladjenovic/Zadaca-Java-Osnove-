package zadaca6;

/**
 * Naziv klase: Z8_TreciNiz
 * 
 * Opis klase: Program ucitava od korisnika dva niza po 5 brojeva,
 * prebacuje sve clanove u treci niz i sortira treci niz.
 */

import java.util.Scanner;

public class Z8_TreciNiz {
	/*
	 * Uèitati od korisnika dva niza po pet èlanova. 
	 * Prebaciti sve èlanove u treæi niz i sortirati treæi niz.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
				
		//Pitaj korisnika da unese prvi niz brojeva
		System.out.println("Unesite prvi niz od 5 brojeva: ");
				
		//Deklarisi i kreiraj niz
		int[] niz1 = new int[5];
		
		for(int i = 0; i < niz1.length; i++){
			niz1[i] = unos.nextInt();
		}	
		//Pitaj korisnika da unese drugi niz brojeva
		System.out.println("Unesite drugi niz od 5 brojeva: ");
						
		//Deklarisi i kreiraj niz
		int[] niz2 = new int[5];
		
		for(int i = 0; i < niz2.length; i++){
			niz2[i] = unos.nextInt();
		}
		
		//Deklarisi i kreiraj treci niz
		int[] niz3 = new int[10];
		
		System.arraycopy(niz1, 0, niz3, 0, niz1.length);
		System.arraycopy(niz2, 0, niz3, 5, niz2.length);
		
		//Sortiraj treci niz od najmanjeg do najveceg broja
		int a = 0;
		for(int j = 0; j < niz3.length; j++){
			for(int i = 0; i < niz3.length - 1; i++){
				if(niz3[i] > niz3[i+1]){
					a = niz3[i];
					niz3[i] = niz3[i+1];
					niz3[i+1] = a;
				}
			}
		}
		
		//Ispisi rezultat
		System.out.println("Treci niz: ");
		for(int i = 0; i < niz3.length; i++){
			System.out.print(niz3[i] + " ");
		}
		
		
		
		
		
		
		

	}

}
