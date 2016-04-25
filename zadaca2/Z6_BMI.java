package zadaca2;

import java.util.Scanner;

/**
 * Naziv klase: Z6_BMI
 * 
 * Opis klase: Program ispisuje koliki je BMI korisnika
 *  na osnovu unosa njegove tezine i visine
 *  
 * @author Dejan
 *
 */

public class Z6_BMI {
	/*
	 * Napisati program koji pita korisnika da unese svoju težinu
	 *  u kilogramima i visinu u metrima i ispisati koji je korisnikov BMI
	 */

	public static void main(String[] args) {
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese svoju tezinu
		System.out.println("Molimo unesite svoju tezinu u kilogramima: ");
		double tezina = unos.nextDouble();
		
		//Pitaj korisnika da unese svoju visinu u metrima
		System.out.println("Molimo unesite svoju visinu u metrima: ");
		double visina = unos.nextDouble();
		
		//Izracunaj BMI
		double BMI = tezina / (visina * visina);
		
		//Ispisi rezultate
		System.out.println("Vas BMI je " + (int)(BMI * 100) / 100.0);
		if(BMI < 18.5) {
			System.out.println("Vi ste pothranjeni.");
		}
		else if(BMI < 25) {
			System.out.println("Vi ste normalne tezine.");
		}
		else if(BMI < 30) {
			System.out.println("Vi ste gojazni.");
		}
		else {
			System.out.println("Vi ste pretili.");
		}
		

	}

}
