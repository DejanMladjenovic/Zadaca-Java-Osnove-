package zadaca6;

/**
 * Naziv klase: Z5_Zbir_10
 * 
 * Opis klase: Progran ucitava od korisnika niz od 10 brojeva 
 * i ispisuje da li u nizu postoje dva broja kojima je zbir 10
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z5_Zbir_10 {
	/*
	 *Napisati program koji uèitava 10 brojeva od korisnika
	 * i ispisuje da li u nizu postoje dva broja kojima je zbir 10.
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
		
		int brojac = 0;
		for(int i = 0; i < niz.length; i++){
			for(int j = i; j < niz.length; j++){
				if(niz[i] + niz[j] == 10 && i != j){
					brojac++;
				}
			}
		}
		
		//Ispisi rezultat
		if(brojac > 0){
			System.out.println("");
			System.out.println("Ukupno kombinacija gdje je \nzbir dva broja jednak 10: " + brojac);
		}else{
			System.out.println("Nema takvih brojeva.");
		}
	}


}
