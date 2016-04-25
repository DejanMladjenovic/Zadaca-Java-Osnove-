package zadaca2;

/**
 * Naziv klase: Z4_Mjeseci
 * 
 * Opis klase: Svrha programa je da nasumicno generise cijeli broj izmedju 1 i 12.
 * Program ispisuje ime mjeseca za taj broj. (Januar za 1 itd)
 * 
 * @author Dejan
 *
 */

public class Z4_Mjeseci {
	/*
	 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12
	 *  te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
	 */

	public static void main(String[] args) {
		
		//Generisi nasumicno cijeli broj izmedju 1 i 12
		int broj = (int)(1 + Math.random() * 12);
		String mjesec;
		
		if(broj == 1) {
			mjesec = "Januar";
		}
		else if(broj == 2) {
			mjesec = "Februar";
		}
		else if(broj == 3) {
			mjesec = "Mart";
		}
		else if(broj == 4) {
			mjesec = "April";
		}
		else if(broj == 5) {
			mjesec = "Maj";
		}
		else if(broj == 6) {
			mjesec = "Jun";
		}
		else if(broj == 7) {
			mjesec = "Jul";
		}
		else if(broj == 8) {
			mjesec = "Avgust";
		}
		else if(broj == 9) {
			mjesec = "Septembar";
		}
		else if(broj == 10) {
			mjesec = "Oktobar";
		}
		else if(broj == 11) {
			mjesec = "Novembar";
		}
		else{
			mjesec = "Decembar";
		}
		System.out.println(mjesec);

	}

}
