package zadaca11;

/**
 * Naziv klase: Brojevi2
 * 
 * Opis klase: Svrha programa je da ucita matricu iz fajla i da ispise zbirove clanova svih redova posebno.
 * Program ispisuje koji red ima najveci zbir clanova
 * 
 * @author Dejan Mladjenovic
 */

import java.io.*;
import java.util.Scanner;

public class Brojevi2 {
	/*
	 * U fajlu "brojevi2.txt" nalazi se deset redova sa cijelim brojevima. 
	 * U svakom redu je 5 brojeva. Izraèunati i ispisati zbir svakog reda i ispisati koji zbir je najveæi.
	 */

	public static void main(String[] args) throws IOException {
		
		//Kreiraj i upisi podatke u fajl
		int[][] matrica= new int [10][5];
		File file = new File("brojevi2.txt");
/*		if(file.exists()){
			System.out.println(file.getName() + " vec postoji.");
			System.exit(1);
		}*/
		
		PrintWriter output = new PrintWriter(file);
		
		int i, j;
		int brojac = 0;
		for(i = 0; i < 10; i++){
			for(j = 0; j < 5; j++){
				matrica[i][j] = (int)(Math.random() * 10);
				brojac++;
				if(brojac % 5 == 0){
					output.println(matrica[i][j] + " ");
				}else
					output.print(matrica[i][j] + " ");
			}
		}
		output.close();
		
		//Iscitaj podatke i izracunaj rezultate
		int redMaxZbir = 0;
		int indeks = 0;
		Scanner unos = new Scanner(file);
		while(unos.hasNext()) {
			for(i = 0; i < 10; i++){
				for(j = 0; j < 5; j++){
					matrica[i][j] = unos.nextInt();
					System.out.print(matrica[i][j] + " ");
				}
			System.out.println();
			}
			System.out.println();
			for(i = 0; i < 10; i++){
				int zbir = 0;
				for(j = 0; j < 5; j++){
					zbir += matrica[i][j];	
				}
				if(zbir > redMaxZbir){
					redMaxZbir = zbir;
					indeks = i + 1;
				}
				System.out.println("Zbir elemenata " + (i + 1) + ". reda je: " +zbir);
			}
			System.out.println("\nNajveci zbir ima " + indeks + ". red.");
		}
		unos.close();	
	}	
}


