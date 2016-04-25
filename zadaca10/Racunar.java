package zadaca10;

/**
 * Naziv klase: Racunar
 * 
 * Opis klase: Klasa konstruise objekat naziva "Racunar"
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Racunar {
	/*
	 * Napisati klasu Raèunar sa osobinama kolicinaRAMa, kapacitetHD, brzinaProcesora, 
	 * dijagonalaMonitora, nabavnaCijena. Napisati metodu double izracunajCijenu() koja raèuna cijenu raèunara. 
	 * Cijena raèunara je za 10% veæa od nabavne cijene
	 * RAM izraziti u gigabajtima, kapacitet hard diska takoðe u gigabajtima, brzinu procesora u gigahercima, 
	 * dijagonalu monitora u inèima.
	 */
	
	//Osobine
	double kolicinaRAMa;
	int kapacitetHD;
	double brzinaProcesora;
	double dijagonalaMonitora;
	double nabavnaCijena;
	
	
	//Konstruktor
	Racunar(double kolicinaRAMa, int kapacitetHD, double brzinaProcesora, double dijagonalaMonitora, double nabavnaCijena){
		
		this.kolicinaRAMa = kolicinaRAMa;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
		
	}
	
	//Metode
	public double izracunajCijenu(){
		return nabavnaCijena + (nabavnaCijena * 0.10);
	}

	public void stampajPodatke(){
		System.out.println("RAM: " + kolicinaRAMa + " GB." );
		System.out.println("HD: " + kapacitetHD + " GB.");
		System.out.println("Procesor: " + brzinaProcesora + " GHz");
		System.out.println("Monitor: " + dijagonalaMonitora + " inèa");
		System.out.println("Nabavna cijena: " + nabavnaCijena + " KM.");	
	}

}
