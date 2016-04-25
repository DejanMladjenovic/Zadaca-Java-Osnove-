package zadaca4;

/**
 * Nazv klase: Z4_Suma
 * 
 * Opis klase: Program ucitava od korisnika dva broja i ispisuje da li je veca suma brojeva od 1 do broja1
 *  ili je veca suma brojeva od broja1 do broja2
 *  
 *  @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z4_Suma {
	/*
	 * Napisati program koji od korisnika uèitava dva broja a i b(a < b)
	 *  i ispisuje da li je veæa suma brojeva od 1 do a ili suma brojeva od a do b.
	 */

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Molimo unesite jedan broj: ");
		int broj1 = unos.nextInt();
		
		System.out.println("Molimo unesite drugi broj veci od " + broj1 +":");
		int broj2 = unos.nextInt();
		
		int a = suma(1, broj1);
		int b = suma(broj1, broj2);
		
		System.out.println("Suma brojeva od 1 do " + broj1 + ": " + a);
		System.out.println("Suma brojeva od " + broj1 + " do " + broj2 + ": " + b);
		
		if(a < b) {
			System.out.println("Suma brojeva od  1 do " + broj1 + " manja je od sume brojeva od " + broj1 + " do " + broj2);
		}else{
			System.out.println("Suma brojeva od  1 do " + broj1 + " veca je od sume brojeva od " + broj1 + " do " + broj2);
		}
		
		
		
		
	}
	/**Vraca sumu dva broja*/
	public static int suma( int a, int b) {
		int rezultat = 0;
		for(int i = a; i<=b; i++){
			rezultat += i;
		}
		return rezultat;
	}
}
