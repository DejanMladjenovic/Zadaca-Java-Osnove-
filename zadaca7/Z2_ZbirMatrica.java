package zadaca7;

/**
 * Naziv klase: Z2_ZbirMatrica
 * 
 * Opis klase: Program ucitava od korisnika dvije matrice istih dimenzija i kreira trecu
 * matricu koja kao clanove ima zbir odgovarajucih clanova prve i druge matrice
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z2_ZbirMatrica {
	/*
	 * Napisati metodu koja sabira 2D niza koja korisnik unese. Metoda treba da koristi sljedeæi header:
	 * public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b)
	 * Da bi dvije matrice bile sabrane, moraju biti istih dimenzija i istog ili kompatibilnog tipa elemenata.
	 * Rezultat sabiranja matrica pohraniti u treæu matricu, matricu c, i ispisati korisniku rezultat.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese broj redova za matrice
		System.out.println("Molimo unesite broj redova: ");
		int r = unos.nextInt();
		
		//Pitaj korisnika da unese broj kolona
		System.out.println("Molimo unesite broj kolona: ");
		int k = unos.nextInt();
		
		//Kreiraj i ucitaj prvu matricu od korisnika
		System.out.println("Unesite clanove prve matrice: ");
		double[][] matrix1 = new double [r][k];
		for(int a = 0; a < matrix1.length; a++){
			for(int b = 0; b < matrix1[a].length; b++){
				matrix1[a][b] = unos.nextDouble(); 	
			}
		}
		
		//Kreiraj i ucitaj drugu matricu od korisnika
		System.out.println("Unesite clanove druge matrice: ");
		double[][] matrix2 = new double [r][k];
		for(int a = 0; a < matrix2.length; a++){
			for(int b = 0; b < matrix2[a].length; b++){
				matrix2[a][b] = unos.nextDouble(); 	
			}
		}
		
		//Ispisi prvu matricu
		System.out.println("\nPrva matrica:");
		for(int a = 0; a < matrix1.length; a++){
			for(int b = 0; b < matrix1[a].length; b++){
				System.out.print(matrix1[a][b] + " ");
			}
			System.out.println();
		}
		
		//Ispisi drugu matricu
		System.out.println("\nDruga matrica:");
		for(int a = 0; a < matrix2.length; a++){
			for(int b = 0; b < matrix2[a].length; b++){
				System.out.print(matrix2[a][b] + " ");
			}
			System.out.println();
		}
		
		
		//Kreiraj i ispisi trecu matricu
		double[][]matrix3 = addMatrix(matrix1, matrix2);
		System.out.println("\nTreca matrica:");
		for(int a = 0; a < matrix3.length; a++){
			for(int b = 0; b < matrix3[a].length; b++){
				System.out.print(matrix3[a][b] + " ");
			}
			System.out.println();
		}
	}
	
	/**Vraca zbir dvije matrice*/
	public static double[][] addMatrix(double[][] a, double[][] b){
		
		double[][] suma = new double[a.length][a[0].length];
		for(int i = 0; i < suma.length; i++){
			for(int j = 0; j < suma[i].length; j++){
				suma[i][j] = a[i][j] + b[i][j];
			}
		}
		return  suma;
	}

}
