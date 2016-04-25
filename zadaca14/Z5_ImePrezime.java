package zadaca14;

/**
 * Naziv klase: Z5_imePrezime
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z5_ImePrezime {
	/*
	 * Uèitati od korisnika ime i prezime. 
	 * Ukoliko je korisnik unio ime i prezime malim slovom ispisati ime i prezime velikim poèetnim slovom.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime i prezime: ");
		String potpis = input.nextLine();
		
		System.out.println(zamjena(potpis));

	}
	
	/**Vraca prvo veliko slovo svake rijeci*/
	public static String zamjena(String a){
		
		char[] slovo = a.toCharArray();
		slovo[0] = Character.toUpperCase(slovo[0]);
		for(int i = 1; i < slovo.length; i++){
			if(Character.isWhitespace(slovo[i - 1])){
				slovo[i] = Character.toUpperCase(slovo[i]);
			}
		}
		
		return new String(slovo);
	}
	
}
