package zadaca13;

public class Z5_PolovniAutomobili {
	/*
	 * Napisati klasu polovniAutomobili. Klasa ima atribute Proizvodjaè, model, predjenaKilometraza, godiste, cijena. 
	 */
	
	//Osobine
	private String proizvodjac;
	private String model;
	private int predjenaKilometraza;
	private int godiste;
	private double cijena;
	
	//Konstruktor
	public Z5_PolovniAutomobili(){
		
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

	public int getPredjenaKilometraza() {
		return predjenaKilometraza;
	}

	public void setPredjenaKilometraza(int predjenaKilometraza) {
		this.predjenaKilometraza = predjenaKilometraza;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public double getCijena() {
		return cijena;
	}

	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	
	public String toString(){
		return proizvodjac + " " + model + "\nPresao: " + predjenaKilometraza + " km" +
				"\nGodina proizvodnje: " + godiste + "\nCijena: " + cijena + " KM";
	}
	
	

}
