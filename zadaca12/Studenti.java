package zadaca12;

/**
 * Naziv klase: Studenti
 * 
 * @author Dejan Mladjenovic
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Studenti {

	/*
	 * U fajlu studenti.txt nalaze se podaci o studentima. 
	 * U svakom redu nalazi se ime, prezime, godina studija, i tri ocjene. 
	 * Proèitati fajl, napraviti objekat za svakog studenta i objekte postaviti u niz. 
	 * Sortirati objekte po prosjeènoj ocjeni i upisati u novi fajl sortiranistudenti.txt.
	 */

	public static void main(String[] args) throws IOException{
		
		//Iscitaj podatke iz fajla
		File file = new File("studenti.txt");
		ArrayList<Student> lista = new ArrayList<>();
		Scanner input = new Scanner(file);
		
		if(file.exists()){
				while(input.hasNext()) {
					Student student = new Student();
					student.setIme(input.next());
					student.setPrezime(input.next());
					student.setGodinaStudija(input.nextInt());
					student.setProgramiranje(input.nextInt());
					student.setBazePodataka(input.nextInt());
					student.setHtml(input.nextInt());
					lista.add(student);
/*					lista.add(new Student(input.next(), input.next(), input.nextInt(), input.nextInt(), 
							input.nextInt(), input.nextInt()));*/
				}
		}
			
			input.close();
			
			//Sortiraj objekte
			Collections.sort(lista);
			
			//Deklarisi i kreiraj drugi fajl
			File fileSort = new File("SortiraniStudenti.txt");

			if(file.exists()){
				System.out.println(fileSort.getName() + " vec postoji.");
				System.exit(1);
			}
			
			PrintWriter output = new PrintWriter(fileSort);
			for(int i = 0; i < lista.size(); i++){
				output.print(lista.get(i).getIme() + " ");
				output.print(lista.get(i).getPrezime() + " ");
				output.print(lista.get(i).getGodinaStudija() + " ");
				output.print(lista.get(i).getProgramiranje() + " ");
				output.print(lista.get(i).getBazePodataka() + " ");
				output.print(lista.get(i).getHtml() + " ");
				output.println();
			} 
			output.close(); 
	
		
	}
}


