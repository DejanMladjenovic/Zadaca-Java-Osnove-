package zadaca14;

/**
 * Naziv klase: Z1_Lozinka
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z1_Lozinka {
	/*
	 * Napisati zadatak u kojem provjeravamo da li je lozinka dobro napisana. 
	 * Pored provjere da li je lozinka dovoljno duga(minimalno 6 znakova) i provjere da li su dvije lozinke iste, 
	 * provjeriti i da li je korisnik ukucao bar jednu cifru i bar jedno veliko slovo engleskog alfabeta.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String lozinka = null;
		String lozinka1 = null;
		
		
		do{	
			System.out.println("Unesite lozinku(min 6 znakova, bar 1 veliko slovo i bar 1 cifra): ");
			lozinka = input.nextLine();
		}while(!(jeIspravna(lozinka)));
		
		do{
			System.out.println("Ponovite lozinku: ");
			lozinka1 = input.nextLine();
			if(jeJednaka(lozinka, lozinka1))
				System.out.println("Lozinka je ispravna!");
			else{
				System.out.println("Lozinka nije ispravna!");
				System.out.println("Lozinka mora sadrzavati minimalno 6 znakova!");
				System.out.println("Lozinka mora imati bar jedno veliko slovo i jednu cifru!");
				System.out.println();
			}
		}while(!(jeJednaka(lozinka, lozinka1)));
		
		input.close();
	}
	
	
	/**Provjerava da li je lozinka ispravna*/
	public static boolean jeIspravna(String lozinka){
		int brojac = 0;
		int slovo = 0;
		char a;
		if(lozinka.length() < 6)
			return false;
		else{
			for(int i = 0; i < lozinka.length(); i++){
				a = lozinka.charAt(i);
				if(!Character.isLetterOrDigit(a))
					return false;
				else if(Character.isDigit(a))
					brojac++;
				else if(Character.isUpperCase(a))
					slovo++;
			}
			if(brojac < 1 || slovo < 1)
				return false;
			
		}
		return true;
	}
	
	/**Provjerava da li su lozinke iste*/
	public static boolean jeJednaka(String lozinka, String lozinka1){
		if(lozinka.equals(lozinka1))
			return true;
		return false;
	}

}
