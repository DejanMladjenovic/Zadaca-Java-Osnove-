package zadaca11;

/**
 * Naziv klase: ocjeneKopija
 * 
 * Opis klase: Program ucitava podatke iz fajla "ocjene.txt" i kopira podatke 
 * u novi fajl naziva "ocjenekopija.txt". Program ispisuje i prosjek unesenih ocjena
 * 
 * @author Dejan Mladjenovic
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OcjeneKopija {

	public static void main(String[] args) throws IOException {
 
		File org = new File("ocjene.txt");
		
		Scanner unos = new Scanner(org);
		File copy = new File("ocjeneKopija.txt");
		if(copy.exists()){
			System.out.println(copy.getName() + " vec postoji.");
			System.exit(1);
		}
		PrintWriter output = new PrintWriter(copy);
		System.out.println("Fajl se nalazi u: \n" +org.getAbsolutePath());
		
		while(unos.hasNext()){
			String ime = unos.next();
			String prezime = unos.next();
			int ocjena1 = unos.nextInt();
			int ocjena2 = unos.nextInt();
			int ocjena3 = unos.nextInt();
			double prosjek = (double)(ocjena1 + ocjena2 + ocjena3) / 3;
			output.print(ime + " ");
			output.print(prezime + " ");
			output.print(ocjena1 + " ");
			output.print(ocjena2 + " ");
			output.print(ocjena3 + " ");
			output.print(prosjek + " " );
			output.println();
		}
		unos.close();
		output.close();
		

	}

}
