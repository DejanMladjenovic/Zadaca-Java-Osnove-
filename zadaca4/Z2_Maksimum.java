package zadaca4;

/**
 * Naziv klase: Z2_Maksimum
 * 
 * Opis klase: Program generise tri nasumicna decimalna broja
 *  i ispisuje broj koji je najveci od tih brojeva.
 *
 * @author Dejan
 */

public class Z2_Maksimum {
	/*
	 * Napisati metodu koja ima tri argumenta(decimalni brojevi) i koja kao rezultat vraæa najveæi od tih brojeva.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Generisi tri nasumicna broja
		double a = (int)(Math.random() * 10000) / 100.0;
		double b = (int)(Math.random() * 10000) / 100.0;
		double c = (int)(Math.random() * 10000) / 100.0;
		
		//Ispisi rezultat
		System.out.println("Maksimum od brojeva " + a + " , " + b + " i " + c + " je " + maksimum(a, b, c) + "." );

	}
	/**Vraca maksimum od tri broja*/
	public static double maksimum(double a, double b, double c) {

		double rezultat;
		if (a > b && a > c)
			rezultat = a;
		else if (b > a && b > c)
			rezultat = b;
		else 
			rezultat = c;
		
		return rezultat;
	}

}
