package zadaca14;

/**
 * Naziv klase: Z3_Samoglasnici
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Z3_Samoglasnici {
	/*
	 * Uèitati od korisnika reèenicu. Ispisati koliko je samoglasnika u reèenici. (a,e,i,o,u)
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neku recenicu: ");
		String recenica = input.nextLine();
		
		char[] slovo = recenica.toCharArray();
		
		int brojac = 0;
		for(int i = 0; i < slovo.length; i++){
			if(slovo[i] == 'a' || slovo[i] == 'e' || slovo[i] == 'i' || slovo[i] == 'o' || slovo[i] == 'u'
					|| slovo[i] == 'A' || slovo[i] == 'E' || slovo[i] == 'I' || slovo[i] == 'O' || slovo[i] == 'U'){
				brojac++;
			}
		}
		System.out.println("U recenici ima " + brojac + " samoglasnika.");
		
		input.close();
	}

}
