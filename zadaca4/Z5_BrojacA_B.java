package zadaca4;

/**
 * Naziv klase: Z5_BrojacA_B
 * 
 * Opis klase: program ucitava od korisnika dva broja
 *  i ispisuje sve brojeve od prvog do drugog broja
 *  
 *  @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z5_BrojacA_B {
	/*
	 * Napisati program koji uèitava od korisnika dva broja
	 *  i ispisuje sve brojeve od manjeg do veæeg uèitanog broja.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		//Izbaci pitanje korisniku da unese prvi broj
		System.out.println("Unesite jedan broj: ");
		int broj1 = unos.nextInt();
		
		//Izbaci pitanje korisniju da unese drugi broj
		System.out.println("Unesite drugi broj veci ili manji od broja " + broj1 + ":");
		int broj2 = unos.nextInt();
		
		//Ispisi rezultate
		while(broj1 != broj2){
			if(broj1 < broj2){
				System.out.println(broj1);
				broj1++;
			}else if(broj1 > broj2){
				System.out.println(broj2);
				broj2++;
			}
		}
		
	}

}
