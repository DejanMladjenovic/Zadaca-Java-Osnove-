package zadaca8;

/**
 * Naziv klase: Z3_Pravougaonici
 * 
 * Opis klase: Program ucitava 10 pravougaonika i ispisuje samo one cija je povrsina veca od 10
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z3_Pravougaonici {
	/*
	 * Napraviti 10 pravougaonika koristeæi klasu iz prethodnog zadatka. 
	 * Stranice pravougaonika uèitati od korisnika i sve pravougaonike smjestiti u niz. 
	 * Nakon što korisnik unese i deseti pravougaonik proæi kroz niz i ispisati 
	 * samo površine pravougaonika koje su veæe od 10 jedinica mjere(npr centimetar kvadratni).
	 */

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		Z2_Pravougaonik pravougaonik = new Z2_Pravougaonik();
		int suma = 1;
		double[] niz = new double[10];
			for(int i = 0; i < niz.length; i++){
				System.out.println("Pravougaonik " + suma);
				System.out.println("Unesite stranicu a: ");
				pravougaonik.setDuzinaStraniceA(unos.nextInt());
				System.out.println("Unesite stranicu b: ");
				pravougaonik.setDuzinaStraniceB(unos.nextInt());
				System.out.println();
				niz[i] = pravougaonik.IzracunajPovrsinu();
				suma++;
			}	
		suma = 1;	
		for(int i = 0; i < niz.length; i++){
			if(niz[i] > 10){
				System.out.println("Pravougaonik " + suma + " ima povrsinu " + niz[i]);
			}
			suma++;
		}
		System.out.println("Ostali pravougaonici imaju povrsinu manju ili jednaku 10");
		

	}

}
