package zadaca13;

/**
 * Naziv klase: Z3_Novcanice
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z3_Novcanice {
	/*
	 * Napisati program koji od korisnika uèitava iznos novca u KM, 
	 * i zatim ispisuje koji je najmanji broj novèanica koji je potreban da se isplati taj iznos. 
	 * Takoðe, program ispisuje sve novèanice koje æe se iskoristiti. 
	 * Program koristi novèanice od 1, 2, 5, 10, 20, 50 , 100 i 200 KM. 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] novac = {1, 2, 5, 10, 20, 50, 100, 200};
		
		System.out.println("Unesite iznos u KM: ");
		int iznos = input.nextInt();
		int brojac = 0;
		System.out.println("Iznos: " + iznos);
		System.out.print("Novcanice za isplatu: ");
		for(int i = novac.length - 1; i >= 0; i--){
			while(iznos / novac[i] >= 1){
				System.out.print(novac[i] + " ");
				iznos -= novac[i];
				brojac++;
			}
		}
		System.out.println("\nUkupno " + brojac + " novcanica.");

	}

}
