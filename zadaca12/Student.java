package zadaca12;

/**
 * Naziv klase: Student
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Student implements Comparable<Student>{
	/*
	 * Napisati klasu student koja ima atribute: ime, prezime, godina studija, programiranje, baze podataka i html. 
	 * Posljednje tri osobine su ocjene iz predmeta. Napisati metodu izracunajProsjek. 
	 * Klasa implementira interface comparable i metodu compareTo. 
	 */

	//Osobine
	private String ime;
	private String prezime;
	private int godinaStudija;
	private int programiranje;
	private int bazePodataka;
	private int html;
	
	//Konstruktori
	public Student() {
	}
	
	public Student(String ime, String prezime, int godinaStudija, int programiranje, int bazePodataka, int html) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaStudija = godinaStudija;
		this.programiranje = programiranje;
		this.bazePodataka = bazePodataka;
		this.html = html;
	}
	
	//Metode
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}

	public int getProgramiranje() {
		return programiranje;
	}

	public void setProgramiranje(int programiranje) {
		this.programiranje = programiranje;
	}

	public int getBazePodataka() {
		return bazePodataka;
	}

	public void setBazePodataka(int bazePodataka) {
		this.bazePodataka = bazePodataka;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public double IzracunajProsjek() {
		return ((double)(programiranje + bazePodataka + html) / 3 );
	}

	@Override
	public int compareTo(Student o) {			
		return  new Double (o.IzracunajProsjek()).compareTo(this.IzracunajProsjek());
        }

}
