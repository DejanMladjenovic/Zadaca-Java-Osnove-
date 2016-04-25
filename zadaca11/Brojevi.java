package zadaca11;

/**
 * Naziv klase: Brojevi
 * 
 * Opis klase: Klasa ispisuje zbir datih brojeva
 * 
 * @author Dejan Mladjenovic
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Brojevi {
	/*
	 * U fajlu "brojevi.txt" nalazi se nepoznata kolièina cijelih brojeva. 
	 * Napisati program koji èita sve brojeve i ispisuje na ekran njihov zbir.
	 */

	public static void main(String[] args) throws IOException {
		
		//Kreiraj i upisi podatke u fajl
		File file = new File("brojevi.txt");
		if(file.exists()){
			System.out.println(file.getName() + " vec postoji.");
			System.exit(0);
		}
		 
		PrintWriter output = new PrintWriter(file);
		
		int brojac = 0;
		System.out.println("Brojevi: ");
		for(int i = 0; i < (int)(Math.random() * 100); i++){
			int broj = (int)(Math.random() * 10);
			brojac++;
			if(brojac % 10 == 0){
				output.println(broj + " ");
				System.out.println(broj + " ");
			}else{
				output.print(broj + " ");
				System.out.print(broj + " ");
			}
		}
		output.close();
		
		//Iscitaj podatke i izracunaj rezultate
		Scanner unos = new Scanner(file);
		int zbir = 0;
		while(unos.hasNext()) {
			int broj = unos.nextInt();
			zbir += broj;
		}
		unos.close();
		System.out.println("\nSuma: " + zbir);
		
		
				
			
		
			
		

	}

}
