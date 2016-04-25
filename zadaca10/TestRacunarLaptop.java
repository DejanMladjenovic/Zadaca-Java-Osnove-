package zadaca10;

/**
 * Naziv klase: TestRacunarLaptop
 * 
 * Opis klase: Program ucitava osnovne podatke o racunaru i laptopu i ispisuje prodajnu cijenu istih
 * 
 * @author Dejan Mladjenovic
 *
 */

public class TestRacunarLaptop {

	public static void main(String[] args) {
		
		//Kreiraj i deklarisi objekte
		Racunar racunar = new Racunar(2, 160, 3.0, 17, 245.80);
		
		Laptop laptop = new Laptop(4, 250, 4.8, 15.4, 316.20, 3);
		
		//Ispisi rezultate
		System.out.println("Racunar: ");
		racunar.stampajPodatke();
		System.out.println("Prodajna cijena: " + racunar.izracunajCijenu());
		System.out.println();
		
		System.out.println("Laptop: ");
		laptop.stampajPodatke();
		System.out.println("Prodajna cijena: " + laptop.izracunajCijenu());
		System.out.println();
		}
}
