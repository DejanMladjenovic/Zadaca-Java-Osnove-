package zadaca7;

/**
 * Naziv klase: Z4_ZbirKolona
 * 
 * Opis klase: Program ucitava od korisnika broj redova i kolona, a zatim i matricu.
 * Program koristi metodu da ispise zbir svih kolona matrice
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z4_ZbirKolona {
	/*
	 * Napisati program koji pita korisnika da unese velièinu niza (redove i kolone) 
	 * te uzima matricu od korisnika i koristeæi vašu metodu ispisuje zbirove svih kolona.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese broj redova
		System.out.println("Molimo unesite broj redova: ");
		int r = unos.nextInt();
		
		//Pitaj korisnika da unese broj kolona
		System.out.println("Molimo unesite broj kolona: ");
		int k = unos.nextInt();
		
		//Kreiraj i ucitaj matricu od korisnika
		System.out.println("Unesite clanove matrice: ");
		int[][] matrica = new int [r][k];
		for(int a = 0; a < matrica.length; a++){
			for(int b = 0; b < matrica[a].length; b++){
				matrica[a][b] = unos.nextInt(); 
			}
		}
		
		//Ispisi matricu
		for(int a = 0; a < matrica.length; a++){
			for(int b = 0; b < matrica[a].length; b++){
				System.out.printf("%3d", matrica[a][b]);
			}
			System.out.println();
		}
		
		//Ispisi rezultat
		zbirKolona(matrica);
	}
	/**Izracunava zbir kolona matrice*/	
	public static void zbirKolona(int [][] matrica){	
		
		int a, b;	
		for(b = 0; b < matrica[0].length; b++){
			int suma = 0;
			for( a = 0; a < matrica.length; a++){	
				suma += matrica[a][b];
				}
			System.out.println("Suma elemenata u koloni " + (b + 1) + " je: " + suma);
		}
	}
		

	

}
