package zadaca14;

/**
 * Naziv klase: Vjesala
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z6_Vjesala {
	/*
	 *  Napraviti igru vješala (hangman). Prikazati reæenicu tako što se umjesto slova pojavljuju taèke. 
	 *  Omoguæiti korisniku da unosi slova. Ako korisnik unese slovo koje postoji u reèenici 
	 *  onda umjeto taèaka prikazati to slovo na odgovarajuæim mjestima. 
	 *  Ukoliko korisnik 5 puta promaši slovo napisati mu poruku "Game over".
	 */

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite rijec: ");
		String rijec = input.nextLine();
		char[] slova = rijec.toCharArray();
		char[] kopija = new char[slova.length];
		for(int i = 0; i < kopija.length; i++){
			if(slova[i] == ' '){
				kopija[i] = ' ';
			}else{
				kopija[i] = '*';
			}
		}
		
		
		int promasaj = 5;

		System.out.println("Pogodite rijec: " + slova.length + " slova");
		System.out.println(kopija);
		
		do{
			System.out.println("\nUnesite slovo: ");
			String proba = input.nextLine();
			char slovo = proba.charAt(0);
			int pom = 0;
			for(int i = 0; i < slova.length; i++){
				if(slovo == slova[i]){
					kopija[i] = slovo;
				}else{
				pom++;
				}   
			}
			if(pom == slova.length) { 
				promasaj--;
				System.out.println("Ne postoji!");
				System.out.println("Mozete pogrijesiti jos " + promasaj + " puta!");
				}
			
			System.out.println(kopija);
			
			if(!String.valueOf(kopija).contains("*"))
				break;
			
			
		}while(promasaj != 0);
		
		if(promasaj == 0){
			System.out.println("GAME OVER!");
		}else{
			System.out.println("Pogodili ste trazenu rijec!");
		}
	}
}
