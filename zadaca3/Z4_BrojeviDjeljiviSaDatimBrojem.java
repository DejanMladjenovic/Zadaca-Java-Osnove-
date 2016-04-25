package zadaca3;

/**
 * Naziv klase: Z4_BrojeviDjeljiviSaDatimBrojem
 * 
 * Opis klase: Program ucitava od korisnika cijeli broj i ispisuje brojeve
 * u intervalu od 1 do 100 koji su djeljivi tim brojem.
 * 
 * @author Dejan Mladjenovic
 */
 
import java.util.Scanner;

public class Z4_BrojeviDjeljiviSaDatimBrojem {
	/*
	 * Uèitati od korisnika jedan cijeli broj. Ispisati sve brojeve koji su
	 * djeljivi sa tim brojem u intervalu od 1 do 100.
	 */

	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Izbaci pitanje korisniku da unese cijeli broj
		System.out.println("Molimo unesite jedan cijeli broj : ");
		 int broj = unos.nextInt();

		int i;//Broj djeljiv sa unesenim brojem
		int brojac = 0;//Ukupno brojeva djeljivih sa unesenim brojem
		
		//Izracunaj i ispisi rezultat
		for(i = 1; i <= 100; i++){
			if((i % broj) == 0){
				System.out.println("\nBroj " + i  + " je djeljiv sa " + broj + ".");
				System.out.println(i + " / " + broj + " = " + (i / broj));
				brojac++;
			}
		}
		System.out.println("\nUkupno ima " + brojac + " brojeva djeljivih sa " + broj  + ".");
	}

}
