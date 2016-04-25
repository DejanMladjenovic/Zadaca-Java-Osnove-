package zadaca9;

/**
 * Naziv klase: Z1_Klub
 * 
 * Opis klase:  Cilj klase je da konstruise objekat naziva "Z1_Klub"
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z1_Klub {
	/*
	 * Napisati klasu Klub koja ima osobine ime, brojPobjeda, brojPoraza, brojNerjesenih, primljeniGolovi, postignutiGolovi. 
	 * Napisati metode:
	 * int bodovi() - metoda raèuna koliko klub ima bodova(svaka pobjeda donosi 3 boda, svaki nerješen rezultat jedan bod).
	 * int golRazlika() - metoda raèuna razliku postignutih i primljenih golova.
	 * Void pobjeda() - metoda dodaje jednu pobjedu klubu.
	 * Void nerjeseno() - metoda dodaje jedna nerjesen rezultat klubu.
	 * Void poraz() - metoda dodaje jedan poraz klubu.
	 */
	
	//Osobine
	String ime;
	int brojPobjeda = 0;
	int brojPoraza = 0;
	int brojNerijesenih = 0;
	int primljeniGolovi = 0;
	int postignutiGolovi = 0;
	
	//Konstruktori
	public Z1_Klub() {
	}
	
	public Z1_Klub(String ime, int brojPobjeda, int brojPoraza, int brojNerijesenih,
			int primljeniGolovi, int postignutiGolovi) {
		this.ime = ime;
		this.brojPobjeda = brojPobjeda;
		this.brojPoraza = brojPoraza;
		this.brojNerijesenih = brojNerijesenih;
		this.primljeniGolovi = primljeniGolovi;
		this.postignutiGolovi = postignutiGolovi;
	}
	
	//Metode
	public int ukupnoUtakmica(){
		return brojPobjeda + brojPoraza + brojNerijesenih;
	}
	public int bodovi() {
		return (brojPobjeda * 3) + (brojNerijesenih);
		}
	
	public int golRazlika() {
		return postignutiGolovi - primljeniGolovi;
	}
	
	public void pobjeda() {
		brojPobjeda++;
	}
	
	public void nerijeseno() {
		brojNerijesenih++;
	}
	
	public void poraz() {
		brojPoraza++;
	}
	
}
