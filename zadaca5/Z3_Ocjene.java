package zadaca5;

/**
 * Naziv klase: Z3_Ocjene
 * 
 * Opis klase: Program ucitava ocjene od korisnika i sabira njihov prosjek.
 * Kada korisnik unese nulu program se obustavlja i ispisuje date ocjene kao i njihov prosjek
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z3_Ocjene {
	/*
	 * Korisnik unosi ocjene od 1 do 5 sve dok ne unese nulu. 
	 * Nakon unosa nule program ispisuje koliko je korisnik unio jedinica, dvojki, 
	 * trojki, èetvorki i petica, te raèuna prosjeènu ocjenu. 
	 * Ako ima bar jedna jedinica onda je prosjeèna ocjena 1.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unosi ocjene (od 1 do 5)
		System.out.println("Molimo unesite ocjenu: ");
		int ocjena;
		int brojac =  0;
		int brojac1 = 0;
		int brojac2 = 0;
		int brojac3 = 0;
		int brojac4 = 0;
		int brojac5 = 0;
		
		//Ponavljaj proces dok korisnik ne unese 0 
		do{
			ocjena = unos.nextInt();
			if(ocjena == 5){
				brojac5++;
			}else if(ocjena == 4){
				brojac4++;
			}else if(ocjena == 3){
				brojac3++;
			}else if(ocjena == 2){
				brojac2++;
			}else if(ocjena == 1){
				brojac1++;	
			}
			if(ocjena < 6 && ocjena != 0)
				brojac++;
			
		}while(ocjena != 0);
		
		//Ispisi rezultate
		System.out.println("Ukupno ima: ");
		if(brojac5 > 0)
			System.out.println("ocjena 5: " + brojac5);
		if(brojac4 > 0)
			System.out.println("ocjena 4: " + brojac4);
		if(brojac3 > 0)
			System.out.println("ocjena 3: " + brojac3);
		if(brojac2 > 0)
			System.out.println("ocjena 2: " + brojac2);
		if(brojac1 > 0)
			System.out.println("ocjena 1: " + brojac1);

		if(brojac1 == 0){
			System.out.println("Prosjek ocjena je " + ((double)(brojac5 * 5 + brojac4 * 4 + brojac3 * 3 + brojac2 * 2)/ brojac));	
		}else
			System.out.println("Prosjecna ocjena je 1.");
	}

}
