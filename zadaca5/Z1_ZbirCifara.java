package zadaca5;

/**
 * Naziv klase: Z1_ZbirCifara
 * 
 * Opis klase: Program ispisuje cetvorocifrene brojeve kojima je zbir prve dvije cifre 
 * jednak zbiru zadnje dvije cifre
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z1_ZbirCifara {
	/*
	 * Ispisati sve èetorocifrene brojeve kojima je zbir prve dvije cifre
	 *  jednak zbiru treæe i èetvrte cifre. Npr 3728, 5555, 1863
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		int a, b, c, d;
		int brojac = 0;
		for (a = 1; a < 10; a++) {
			for (b = 0; b < 10; b++) {
				for (c = 0; c < 10; c++) {
					for (d = 0; d < 10; d++) {
						if (a + b == c + d) {
							System.out.print(a * 1000 + b * 100 + c * 10 + d + " ");
							brojac++;
							if(brojac % 10 == 0)
								System.out.println();
						}
					}
				}
			}
		}

	}

}
