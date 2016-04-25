package zadaca6;

/**
 * Naziv klase: RazlikaMaxMin
 * 
 * Opis klase: Program ucitava od korisnika niz od 10 brojeva
 * i ispisuje razliku najveceg i najmanjeg clana niza
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z1_RazlikaMaxMin {
	/*
	 * Napisati program koji uèitava deset brojeva u niz
	 *  i ispisuje razliku najveæeg i najmanjeg èlana niza.
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
		
		//Odredi najmanji i najveci clan niza
		int max = niz[0];
		int min = niz[0];
		for(int i = 0; i < niz.length; i++){
			if(niz[i] < min) min = niz[i];
			if(niz[i] > max) max = niz[i];
		}
		
		//Ispisi rezultat
		System.out.println("Razlika najveceg i najmanjeg clana niza: \n" + max + " - " + min + " = " + (max - min));
		
 
	}

}
