package zadaca13;

/**
 * Naziv klase: Z1_Matrica
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z1_Matrica {
	/*
	 * Korisnik æe popuniti matricu dimenzija m x n. 
	 * Program treba da odredi i ispiše najmanji broj za svaki red matrice. 
	 * Takoðe, program treba da ispiše najveæi broj meðu minimumima redova.
	 * Prvo treba uèitati brojeve m i n, zatim uèitati matricu i prikazati rezultate raèunanja.
	 */

	public static void main(String[] args) {
		
		//Postavi parametre 
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj redova matrice: ");
		int red = unos.nextInt();
		
		System.out.println("Unesite broj kolona matrice: ");
		int kolona = unos.nextInt();
		System.out.println("Unesite clanove matrice(");
		int[][] matrica = new int[red][kolona];
		int[] niz = new int[red];

		//Ucitaj matricu
		for(int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica[i].length; j++){
				matrica[i][j] = unos.nextInt();
			}
		}
		
		//Iscitaj matricu
		for(int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica[i].length; j++){
				System.out.printf("%2d", matrica[i][j]);
			}
			System.out.println();
		}
		
		//Izracunaj rezultate
		System.out.print("Najmanji clanovi redova: ");
		for(int i = 0; i < matrica.length; i++){
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < matrica[i].length; j++){
				if(matrica[i][j] < min){
					min = matrica[i][j];	
				}
			}
			System.out.print(min + " ");
			niz[i] = min;
		}

		int max = niz[0];  
		for(int i = 0; i < niz.length; i++){  
			if(niz[i] > max){  
				max = niz[i];  
			}
		}
		System.out.println("\nNajveci medju njima je: " + max);  
		
 	}

}

