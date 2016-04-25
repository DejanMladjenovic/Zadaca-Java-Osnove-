package zadaca13;

/**
 * Naziv klase: Z4_TestProjektor
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Z4_TestProjektor {

	public static void main(String[] args) {
		
		Z4_Projektor a = new Z4_Projektor();
		a.ukljuci();
		a.setProizvodjac("Phillips");
		a.setModel("Bello");
		a.getTemperatura();
		a.provjeriTemperaturu();
		a.getZoom();
		System.out.println(a.toString());
		System.out.println();
		
		a.setZoom(1.9);
		a.povecajZoom();
		a.povecajZoom();
		a.povecajZoom();
		a.setTemperatura(34);
		a.provjeriTemperaturu();
		System.out.println(a.toString());

	}

}
