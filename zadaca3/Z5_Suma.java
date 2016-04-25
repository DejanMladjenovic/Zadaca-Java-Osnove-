package zadaca3;

/**
 * Naziv klase: Z5_Suma
 * 
 * Opis klase: Program ucitava brojeve od korisnika.
 * Kad korisnik unese 0, program se obustavlja i sabira sve unijete brojeve
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z5_Suma {
	/*
	 * UÈitavati od korisika brojeve sve dok ne unese nulu. 
	 * Nakon unosa nule ispisati koliko je brojeva korisnik ukupno ukucao.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese broj
		System.out.println("Molimo unesite cijeli broj: ");
		
		int broj = 1;
		int suma =0;
		
		//Ponavljaj proces dok korisnik ne unese 0 i izracunaj sumu
		do{
			broj = unos.nextInt();
			suma += broj;
		}while(broj != 0);
		
		//Ispisi rezultat
		System.out.println("Suma datih brojeva iznosi " + suma + ".");
		

	}

}
