package zadaca3;

/**
 * Naziv klase: Z3_ParniBrojeviDjeljiviSaPet
 * 
 * Opis klase: Porogram ispisuje sve parne djeljive sa 5 u intervalu od 300 do 500
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z3_ParniBrojeviDjeljiviSaPet {
	/*
	 * Ispisati sve parne brojeve djeljive sa 5 u intervalu od 300 do 500
	 */

	public static void main(String[] args) {
	
		int i;
		int brojac = 0;
		
		System.out.println("Parni brojevi od 300 do 500 djeljivi sa 5 su: ");
		
		for(i=300; i<=500; i++){
			if((i % 2 == 0) && (i % 5 == 0)){
				System.out.println(i);
				brojac ++;
			}
		}
		System.out.println("Ukupno ima " + brojac + " takvih brojeva.");
	}

}
