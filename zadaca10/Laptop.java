package zadaca10;

/**
 * Naziv klase: Laptop
 * 
 * Opis klase: Klasa konstruise objekat naziva "Laptop"
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Laptop extends Racunar {
	/*
	 * Napisati klasu Laptop koja nasle�uje klasu Ra�unar. 
	 * Ova klasa ima dodatnu osobinu trajanjeBaterije i cijena laptopa je za 15% ve�a od nabavne 
	 * tako da se mora uraditi override metode izracunajCijenu().
	 * RAM izraziti u gigabajtima, kapacitet hard diska tako�e u gigabajtima, brzinu procesora u gigahercima, 
	 * dijagonalu monitora u in�ima, a trajanje baterije u satima.
	 */
	
	//Osobine
	int trajanjeBaterije;
	
	//Konstruktor
	Laptop(double kolicinaRAMa, int kapacitetHD, double brzinaProcesora, double dijagonalaMonitora, 
			double nabavnaCijena, int trajanjeBaterije) {
		
		super(kolicinaRAMa, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije = trajanjeBaterije;		
	}
	
	//Metode
	public double izracunajCijenu() {
		return nabavnaCijena + (nabavnaCijena * 0.15);
	}
	
	public void stampajPodatke(){
		System.out.println("RAM: " + kolicinaRAMa + " GB." );
		System.out.println("HD: " + kapacitetHD + " GB.");
		System.out.println("Procesor: " + brzinaProcesora + " GHz");
		System.out.println("Monitor: " + dijagonalaMonitora + " in�a");
		System.out.println("Nabavna cijena: " + nabavnaCijena + " KM.");
	}

}
