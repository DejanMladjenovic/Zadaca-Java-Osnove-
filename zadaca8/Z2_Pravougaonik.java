package zadaca8;

/**
 * Naziv klase: Z2_Pravougaonik
 * 
 * Opis klase: Klasa uzima stranice pravougaonika i izracunava povrsinu, obim i duzinu dijagonale
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z2_Pravougaonik {
	/*
	 * Napraviti klasu Pravougaonik koja ima osobine duzinaStraniceA i duzinaStraniceB. 
	 * Napisati metode doubleizracunajPovrsinu(), double izracunajObim() i double izracunajDuzinuDijagonale().
	 */
	
	//Osobine
	int duzinaStraniceA = 1;
	int duzinaStraniceB = 1;
	
	//Konstruktor
	public Z2_Pravougaonik(){
	}
	
	//Metode
	public void setDuzinaStraniceA(int newDuzinaStraniceA){
		duzinaStraniceA = newDuzinaStraniceA; 
	}
	
	public void setDuzinaStraniceB(int newDuzinaStraniceB){
		duzinaStraniceB = newDuzinaStraniceB;
	}
	
	public double IzracunajPovrsinu(){
		return duzinaStraniceA * duzinaStraniceB;
	}
	
	public double IzracunajObim(){
		return 2 * (duzinaStraniceA + duzinaStraniceB);
	}
	
	public double IzracunajDuzinuDijagonale(){
		return Math.sqrt(duzinaStraniceA * duzinaStraniceA +
				duzinaStraniceB * duzinaStraniceB);
	}

}
