package zadaca14;

/**
 * Naziv klase: Z4_Zamjena
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z4_Zamjena {
	/*
	 *  Uèitati od korisnika reèenicu. Ukoliko se u reèenici nalazi "sumljam", s', "nemogu" ili "naj bolji", 
	 *  zamjeniti sa "sumnjam", s, "ne mogu" i "najbolji". 
	 *  Ukoliko iza znakova interpunkcije nema znaka praznine onda ubaciti znak praznine.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		String recenica = input.nextLine();
		
		recenica = recenica.replaceAll("sumljam" , "sumnjam");
		recenica = recenica.replaceAll("s'" , "s");
		recenica = recenica.replaceAll("nemogu" , "ne mogu");
		recenica = recenica.replaceAll("naj bolji" , "najbolji");
		recenica = recenica.replaceAll(",", ", ");
		recenica = recenica.replaceAll(".", ". ");
	
		System.out.println(recenica);
		
		input.close();
	}
	
}
