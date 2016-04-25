package zadaca11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kopija {

	public static void main(String[] args) throws IOException {
		
		//Ucitaj podatke iz fajla "ocjene.txt"
		Scanner unos = new Scanner(new File("ocjene.txt"));
		File org = new File("ocjene.txt");
		String ime = null;
		String prezime = null;
		int ocjena1 = 0;
		int ocjena2 = 0;
		int ocjena3 = 0;
		double prosjek = 0;
		
		
		while(unos.hasNext()){
			ime = unos.next() + " ";
			prezime = unos.next() + " ";
			ocjena1 = unos.nextInt();
			ocjena2 = unos.nextInt() ;
			ocjena3 = unos.nextInt();
			prosjek = (double)(ocjena1 + ocjena2 + ocjena3) / 3;
			System.out.println(ime + " " + prezime + " " + ocjena1 + " " + ocjena2 + " " + ocjena3 + " " + prosjek);
		}
		
		
		File kopija = new File("kopija.txt");
		PrintWriter output = new PrintWriter(kopija);
		
		output.print(ime + " ");
		output.print(prezime + " ");
		output.print(ocjena1 + " ");
		output.print(ocjena2 + " ");
		output.print(ocjena3 + " ");
		output.print(prosjek + " ");
		
		
		output.close();
		unos.close();
		
		
	}
	

}
