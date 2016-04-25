package zadaca13;

/**
 * Naziv klase: Z5_ProdavnicaPolovnihAutomobila
 * 
 * @author Dejan Mladjenovic
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Z5_ProdavnicaPolovnihAutomobila{

	public static void main(String[] args) throws IOException {
		/*
		 * Napisati klasu ProdavnicaPolovnihAutomobila. Klasa na poèetku rada proèita podatke iz fajla automobili.txt. 
		 * Sve automobile pretvori u objekte. Zatim, korisniku se ispiše poruka: 
		 * Za pretragu po proizvoðaèu pritisnite 1. Za pretragu po modelu pritisnite 2. Za pretragu po kilometraži pritisnite 3, 
		 * za pretragu po cijeni pritisnite 4 i za pretragu po godištu pritisnite 5.
		 * Ako korisnik unese 1 ili 2 onda treba prikazati poruku da unese model ili naziv proizvodjaèa. 
		 * Nakon što korisnik unese naziv proizvoðaèa ili model treba prikazati sve automobile koji odgovaraju pretrazi. 
		 * Ako nema takvih automobila onda napisati poruku da nema takvih automobila. 
		 * Ako korisnik izabere opciju 3, 4 ili 5 onda treba uzeti od korisnika dva broja, maksimalnu i minimalnu kilometražu 
		 * ili godište i prikazati sve automobile koji odgovaraju pretrazi. 
		 * Opet, ako nema takvih automobila onda napisati "Dragi gospodine, pa pored ovoliko auta Vi ste našli da tražite ono što nema.
		 */
		
		File file = new File("automobili.txt");
		Scanner input = new Scanner(file);
		ArrayList<Z5_PolovniAutomobili> lista = new ArrayList<>(); 
		
		if(file.exists()){
			while(input.hasNext()){
				Z5_PolovniAutomobili automobil = new Z5_PolovniAutomobili();
				automobil.setProizvodjac(input.next());
				automobil.setModel(input.next());
				automobil.setPredjenaKilometraza(input.nextInt());
				automobil.setGodiste(input.nextInt());
				automobil.setCijena(input.nextDouble());
				lista.add(automobil);
			}
			input.close();
			
			System.out.println("Za pretragu po proizvodjacu pritisnite 1");
			System.out.println("Za pretragu po modelu pritisnite 2");
			System.out.println("Za pretragu po kilometrazi pritisnite 3");
			System.out.println("Za pretragu po cijeni pritisnite 4");
			System.out.println("Za pretragu po godistu pritisnite 5");
			input = new Scanner(System.in);
			int i = 0;
			int pretraga;
			int brojac = 0;
			do{
				System.out.println("Izaberite broj od 1 do 5: ");
				pretraga = input.nextInt();
			}while(!(pretraga >= 1 && pretraga <= 5));
			
			if(pretraga == 1){
				System.out.println("Unesite naziv proizvodjaca: ");
				String proizvodjac = input.next();
				for(i = 0; i < lista.size(); i++){
					if(proizvodjac.equalsIgnoreCase(lista.get(i).getProizvodjac())){
						System.out.println(lista.get(i).toString());
						System.out.println();
						brojac++;
					}
				}
			}else if(pretraga == 2){
				System.out.println("Unesite model automobila: ");
				String model = input.next();
				for(i = 0; i < lista.size(); i++){
					if(model.equalsIgnoreCase(lista.get(i).getModel())){
						System.out.println(lista.get(i).toString());
						System.out.println();
						brojac++;
					}
				}
			}else if(pretraga == 3){
				System.out.println("Unesite kilometrazu: ");
				System.out.println("Od: ");
				int min = input.nextInt();
				System.out.println("Do: ");
				int max = input.nextInt();
				for(i = 0; i < lista.size(); i++){
					if(lista.get(i).getPredjenaKilometraza() >= min && lista.get(i).getPredjenaKilometraza() <= max){
						System.out.println(lista.get(i).toString());
						System.out.println();
						brojac++;
					}
				}
			}else if(pretraga == 4){
				System.out.println("Unesite godiste. ");
				System.out.println("Od: ");
				int min = input.nextInt();
				System.out.println("Do: ");
				int max = input.nextInt();
				for(i = 0; i < lista.size(); i++){
					if(lista.get(i).getGodiste() >= min && lista.get(i).getGodiste() <= max){
						System.out.println(lista.get(i).toString());
						System.out.println();
						brojac++;
					}
				}
			}else if(pretraga == 5){
				System.out.println("Unesite cijenu: ");
				System.out.println("Od: ");
				double min = input.nextDouble();
				System.out.println("Do: ");
				double max = input.nextDouble();
				for(i = 0; i < lista.size(); i++){
					if(lista.get(i).getCijena() >= min && lista.get(i).getCijena() <= max){
						System.out.println(lista.get(i).toString());
						System.out.println();
						brojac++;
					}
				}
				input.close();
			}
			if(brojac == 0){
				System.out.println("Dragi gospodine, pa pored ovoliko auta Vi ste nasli da trazite ono sto nema!");
			}
		
			
		}
		
		

	}

}
