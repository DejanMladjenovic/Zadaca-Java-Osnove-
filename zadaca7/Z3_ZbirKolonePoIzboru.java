package zadaca7;

/**
 * Naziv klase: Z3_ZbirKolonePoIzboru
 * 
 * Opis klase: Program ucitava od korisnika broj redova i kolona matrice,
 * generise nasumicno clanove te matrice i ispisuje zbir clanova u izabranoj koloni
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z3_ZbirKolonePoIzboru {
	/*
	 * Napisati metodu koja vraæa zbir svih elemenata u koloni 
	 * po korisnikovom izboru u matrici sa sljedeæim headerom:
	 * public static void sumColumn (int[ ][ ] m, int columnIndex)
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
		
		//Kreiraj i deklarisi matricu
		System.out.println("Unesite clanove matrice: ");
		int[][] matrica = new int [r][k];
		for(int a = 0; a < matrica.length; a++){
			for(int b = 0; b < matrica[a].length; b++){
				matrica[a][b] = (int)(Math.random()* 100); 
			}
		}
		
		//Ispisi matricu
		System.out.println("Matrica:");
		for(int a = 0; a < matrica.length; a++){
			for(int b = 0; b < matrica[a].length; b++){
				System.out.printf("%3d", matrica[a][b]);
			}
			System.out.println();
		}
		
		//Izaberi broj kolone i ispisi rezultat
		System.out.println("Izaberite broj kolone (od 1 do " + matrica[0].length + "): ") ;
		int c = unos.nextInt();
		c = c -1;
	
		 sumColumn(matrica, c);
	}
	
	/**Izracunava zbir clanova zadate kolone*/
	public static void sumColumn(int[][] m, int columnIndex){
		
		int suma = 0;
		for(int a = 0; a < m.length; a++){
			suma += m[a][columnIndex];
		}
		System.out.println("Suma clanova u " + (columnIndex + 1)  + ". koloni iznosi: " + suma);
	}

}
