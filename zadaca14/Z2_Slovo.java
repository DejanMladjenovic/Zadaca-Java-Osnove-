package zadaca14;

/**
 * Naziv klase: Z2_Slovo
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z2_Slovo {
	/*
	 * Napisati program koji od korisnika uèitava jedno slovo i ispisuje naredno slovo engleskog alfabeta. 
	 * Koristiti ASCII, ne pisati sva slova u niz.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite jedno slovo engleskog alfabeta: ");
		String slovo = input.nextLine();
		
		char karakter= slovo.charAt(0);
		if(karakter == 'Z'){
			System.out.println("A");
		}
		else if(karakter == 'z'){
			System.out.println("a");
		}else{
			System.out.println((char) (karakter + 1));
		}
		input.close();
	}

}
