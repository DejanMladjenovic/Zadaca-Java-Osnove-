package zadaca6;

/**
 * Naziv klase: Z3_ParniIliNeparni
 * 
 * Opis klase: Program ucitava od korisnika niz od 10 brojeva
 * i ispisuje da li je korisnik unio vise parnih ili neparnih brojeva
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z3_ParniIliNeparni {
	/*
	 * Napisati program koji uèitava uèitava deset brojeva 
	 * i ispisuje da li je korisnik ukucao više parnih ili neparnih brojeva.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
				
		//Pitaj korisnika da unese 10 brojeva
		System.out.println("Unesite 10 brojeva: ");
				
		//Deklarisi i kreiraj niz
		int[] niz = new int[10];
		
		int parni = 0;
		int neparni = 0;
		for(int i = 0; i < niz.length; i++){
			niz[i] = unos.nextInt();
			if(niz[i] % 2 == 0)
				parni++;
			else
				neparni++;
		}
		
		//Ispisi rezultat
		System.out.println("Parnih brojeva ima: " + parni);
		System.out.println("Neparnih brojeva ima: " + neparni);
		
		if(parni > neparni)
			System.out.println("Vise ima parnih brojeva.");
		else if(parni < neparni)
			System.out.println("Vise ima neparnih brojeva.");
		else
			System.out.println("Ima jednako parnih i neparnih brojeva.");
		

	}

}
