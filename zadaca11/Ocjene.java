package zadaca11;

/**
 * Naziv klase: Ocjene
 * 
 * Opis klase: Klasa kreira dva fajla 
 * 
 * @author Dejan Mladjenovic
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.*;

 class Ocjene {
	/*
	 * U fajlu "ocjene.txt" nalazi se u svakom redu ime studenta, prezime studenta i tri ocjene. 
	 * Napisati program koji kopira sadržaj ovog fajla u fajl "kopija.txt". 
	 * Pored kopiranja podataka, program dodaje još jedan podatak na kraj reda, a to je prosjek ocjena.
	 */
	
	public static void main(String[] args) throws IOException {
		
		//Krieraj prvi fajl
		File file = new File("ocjene.txt");
		if (file.exists()){
			System.out.println("Fajl vec postoji.");
			System.exit(1);
		}
		
		//Unesi podatke u fajl
		try (
			PrintWriter output = new PrintWriter(file);
		) {	
			System. out.println("Unesite broj studenata: ");
			Scanner unos = new Scanner(System.in);
			int n = unos.nextInt();
			int[] niz = new int[n];
			for (int i = 0; i < niz.length; i++){
				System.out.println("Student " + (i + 1));
				System.out.println("Unesite ime: ");
				output.print(unos.next() + " ");
				System.out.println("Unesite prezime:");
				output.print(unos.next() + " ");
				System.out.println("Unesite tri ocjene: ");
				output.print(unos.nextInt() + " ");
				output.print(unos.nextInt() + " ");
				output.print(unos.nextInt() + " ");
				output.println();
			}
			output.close();
			unos.close();	
		} catch (InputMismatchException ex) {
			System.out.println("Nepravilan unos.");
		} catch (NoSuchElementException ex) {
			System.out.println("Nepravilan unos.");
		}
		
		//Iscitaj podatke
		Scanner unos = new Scanner(file);
		while(unos.hasNext()) {
			String ime = unos.next();
			String prezime = unos.next();
			int ocjena1 = unos.nextInt();
			int ocjena2 = unos.nextInt();
			int ocjena3 = unos.nextInt();
			System.out.println(ime + " " + prezime + " " + ocjena1 + " " + ocjena2 + " " 
					+ ocjena3);
		}
		unos.close();
	}

}
