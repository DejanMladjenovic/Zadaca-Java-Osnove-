package zadaca13;

/**
 * Naziv klase: Z2_Niz
 * 
 * @author Dejan Mladjenovic
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Z2_Niz {
	/*
	 * Korisnik unosi niz od 20 brojeva. 
	 * Program rasporeðuje èlanove niza tako da se prvo rasporeðuju parni a zatim neparni brojevi. 
	 * Redoslijed pojavljivanja parnih i neparnih brojeva treba saèuvati.
	 */

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		int[] niz = new int[20];
		ArrayList<Integer> parni = new ArrayList<>();
		ArrayList<Integer> neparni = new ArrayList<>();
		
		System.out.println("Molimo unesite niz od 20 brojeva: ");
		for(int i = 0; i < niz.length; i++){
			niz[i] = unos.nextInt();
		}
		
		//Rasporedi clanove na parne i neparne
		for(int i = 0; i < niz.length; i++){
			if(niz[i] % 2 == 0){
				parni.add(niz[i]);
			}else{
				neparni.add(niz[i]);
			}	
		}
		
		//Ispisi rezultate
		System.out.print("Unijeti brojevi su(parni pa neparni: ");
		for(int i = 0; i < parni.size(); i++){
			System.out.print(parni.get(i) + " ");	
		}
		for(int i = 0; i < neparni.size(); i++){
			System.out.print(neparni.get(i) + " ");
		}

	}

}
