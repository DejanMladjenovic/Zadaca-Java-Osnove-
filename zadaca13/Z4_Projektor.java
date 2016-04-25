package zadaca13;

/**
 * Naziv klase: Z4_Projektor
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z4_Projektor {
	/*
	 * Napisati klasu Projektor koja ima atribute Proizvodjac, model, zoom, ukljuèenProjektor, ukljucenCooler i temperatura. 
	 * Napisati konstruktor koji kao parametre prima model i proizvodjac, zoom postavlja na 1, 
	 * temperaturu na 18 stepeni, ukljucenCooler na false i ukljuèenProjektor na false
	 * Napisati metode ukljuci() i iskljuci() koje ukljuèuju i iskljuèuju projektor. 
	 * Napisati set i get metode za sve atribute. Napisati metodu povecajZoom() koja poveæava zoom za 0,2. 
	 * Ako je zoom 2 onda se zoom vraæa na 1. Napisati metodu provjeriTemperaturu() koja provjerava temperaturu i ako je 
	 * temperatura iznad 30 stepeni ukljuèuje cooler ako je bio iskljuèen. Ako je temperatura ispod 30 stepeni cooler treba iskljuèiti.
	 */
	
	//Osobine
	private String proizvodjac;
	private String model;
	private double zoom = 1;
	private boolean ukljucenProjektor = false;
	private boolean ukljucenCooler = false;
	private double temperatura = 18;
	
	//Konstruktori
	public Z4_Projektor(){
	}
	
	public Z4_Projektor(String proizvodjac, String model, double zoom, boolean ukljucenProjektor, 
			boolean ukljucenCooler, double temperatura){
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.zoom = zoom;
		this.ukljucenProjektor = ukljucenProjektor;
		this.ukljucenCooler = ukljucenCooler;
		this.temperatura = temperatura;
	}

	//Metode
	public void ukljuci(){
		ukljucenProjektor = true;
	}
	
	public void iskljuci(){
		ukljucenProjektor = false;
	}
	
	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getZoom() {
		return zoom;
	}

	public void setZoom(double zoom) {
		if(ukljucenProjektor && zoom >= 1 && zoom <=2)
			this.zoom = zoom;
	}

	public boolean isUkljucenProjektor() {
		return ukljucenProjektor;
	}

	public void setUkljucenProjektor(boolean ukljucenProjektor) {
		this.ukljucenProjektor = ukljucenProjektor;
	}

	public boolean isUkljucenCooler() {
		return ukljucenCooler;
	}

	public void setUkljucenCooler(boolean ukljucenCooler) {
		this.ukljucenCooler = ukljucenCooler;
	}

	public double getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(double temperatura){
		this.temperatura = temperatura;
	}
	
	public void povecajZoom(){
		if(ukljucenProjektor){
			if(zoom == 2)
				zoom = 1;
			else if(zoom == 1.9)
				zoom = 2;
			else
				zoom = zoom + 0.2;
		}
	}
	
	public void provjeriTemperaturu(){
		if(temperatura > 30){
			if(!ukljucenCooler){
				ukljucenCooler = true;
			}
		}else if(temperatura <= 30){
			if(ukljucenCooler){
				ukljucenCooler = false;
			}
		}
		
	}
	
	public String toString(){
		return "Projektor " + proizvodjac + " " + model + "\nzoom: " + zoom + " " + "\nventilator ukljucen: " + ukljucenCooler ;
	}

}
