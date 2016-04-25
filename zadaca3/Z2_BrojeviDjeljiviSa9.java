package zadaca3;

/**
 * Naziv klase: Z2_BrojeviDjeljiviSaDevet
 * 
 * Opsi klase: Program ispisuje brojeve u intervalu od 1 do 200 koji su djeljivi sa 9, 
 * i ispisuje koliko je ukupno takvih brojeva u datom intervalu
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z2_BrojeviDjeljiviSa9 {
	/*
	 * Ispisati sve brojeve djeljive sa 9 u intervalu od 1 do 200
	 */

	public static void main(String[] args) {

		int i;
		int brojac = 0;
		for (i = 1; i <= 200; i++) {
			if (i % 9 == 0) {
				System.out.println("Broj " + i + " je djeljiv sa 9.");
				brojac++;
			}
		}
		System.out.println("Od 1 do 200 ima ukupno " + brojac
				+ " brojeva djeljivih sa 9.");
	}
}
