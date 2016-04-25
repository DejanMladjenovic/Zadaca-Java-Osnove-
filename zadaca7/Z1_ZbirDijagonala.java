package zadaca7;

/**
 * Naziv klase: Z1_ZbirDijagonala
 * 
 * Opis klase: Program ispisuje zbir clanova matrice duz dijagonala.
 * Program poziva metodu koja izracunava dati zbir
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z1_ZbirDijagonala {
	/*
	 * Napisati metodu koja sabira sve brojeve u dijagonali 4x4 matrice. Metoda koristi sljedeæi header:
	 * public static double sumDiagonal(int[][] array)
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner input = new Scanner(System.in);
		
		//Kreiraj i ucitaj matricu od korisnika
		int[][] matrix = new int[4][4];
		System.out.println("Unesite matricu(4 x 4): ");
		for(int a = 0; a < matrix.length; a++){
			for(int b = 0; b < matrix[a].length; b++){
				matrix[a][b] = input.nextInt(); 
			}
		}
		
		//Ispisi matricu
		for(int a = 0; a < matrix.length; a++){
			for(int b = 0; b < matrix[a].length; b++){
				System.out.printf("%3d", matrix[a][b]);
			}
			System.out.println();
		}
		
		//Ispisi sumu
		System.out.println("\nSuma clanova matrice duz dijagonala iznosi: ");
		System.out.println(sumDiagonal(matrix));
		

	}
	
	/**Vraca sumu clanova u dijagonalama*/
	public static double sumDiagonal(int[][] array){
		
		int total = 0;
		for(int a = 0; a < array.length; a++){
			for(int b = 0; b < array[a].length; b++){
				if(a == b || a + b == array.length -1){
					total += array[a][b];
				}
			}
		}
		return total;
	}

}
