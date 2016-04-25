package zadaca18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;


public class TestKnjiga {

	public static void main(String[] args) throws SQLException {
		
		JFrame prozor = new JFrame("Biblioteka");
		JTabbedPane jtp = new JTabbedPane();
		prozor.add(jtp);
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jtp.setVisible(true);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		
		jp1.setLayout(null);;
		jp2.setLayout(null);
		jp3.setLayout(null);
		jp4.setLayout(null);
		
		jtp.addTab("Unos knjiga", jp1);
		jtp.addTab("Pretrazi knjige", jp2);
		jtp.addTab("Izmjeni podatke", jp3);
		jtp.addTab("Izbrisi knjigu", jp4);

		jp1.setVisible(true);
		jp2.setVisible(true);
		jp3.setVisible(true);
		jp4.setVisible(true);

//		Tab 1
		final JTextField imeAutora = new JTextField(20);
		final JTextField prezimeAutora = new JTextField(20);
		final JTextField naslov = new JTextField(20);
		final JTextField brojStranica = new JTextField(20);
		final JTextField izdavac = new JTextField(20);
		
		final JLabel imeAutoraOpis = new JLabel("Ime autora:");
		final JLabel prezimeAutoraOpis = new JLabel("Prezime autora:");
		final JLabel naslovOpis = new JLabel("Naslov knjige:");
		final JLabel brojStranicaOpis = new JLabel("Broj stranica:");
		final JLabel izdavacOpis = new JLabel("Izdavac knjige:");
		final JLabel potvrda = new JLabel("");
		
		final JButton dodaj = new JButton("Dodaj Knjigu");
 		
		jp1.add(imeAutora);
		jp1.add(prezimeAutora);
		jp1.add(naslov);
		jp1.add(brojStranica);
		jp1.add(izdavac);
		jp1.add(imeAutoraOpis);
		jp1.add(prezimeAutoraOpis);
		jp1.add(naslovOpis);
		jp1.add(brojStranicaOpis);
		jp1.add(izdavacOpis);
		jp1.add(potvrda);
		jp1.add(dodaj);

		imeAutora.setBounds(150, 100, 200, 20);
		prezimeAutora.setBounds(150, 150, 200, 20);
		naslov.setBounds(150, 200, 200, 20);
		brojStranica.setBounds(150, 250, 200, 20);
		izdavac.setBounds(150, 300, 200, 20);
		imeAutoraOpis.setBounds(50, 100, 200, 20);
		prezimeAutoraOpis.setBounds(50, 150, 200, 20);
		naslovOpis.setBounds(50, 200, 200, 20);
		brojStranicaOpis.setBounds(50, 250, 200, 20);
		izdavacOpis.setBounds(50, 300, 200, 20);
		dodaj.setBounds(150, 350, 200, 20);
		potvrda.setBounds(170, 400, 200, 20);
		
		prozor.setVisible(true);
		prozor.setSize(500, 500);
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Tab 2
		final JTextArea ispis = new JTextArea();
		final JLabel pretraga = new JLabel("Izaberite polje za pretragu");
		final JLabel imeOpis = new JLabel("Ime autora:");
		final JLabel prezimeOpis = new JLabel("Prezime autora:");
		final JLabel nazivOpis = new JLabel("Naziv djela:");
		final JTextField ime = new JTextField(10);
		final JTextField prezime = new JTextField(10);
		final JTextField naziv = new JTextField(10);
		JButton pretrazi = new JButton("Pretraga");
		
		JScrollPane vbar = new JScrollPane(ispis);
	    vbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		jp2.add(vbar);
		jp2.add(pretraga);
		jp2.add(ime);
		jp2.add(prezime);
		jp2.add(naziv);
		jp2.add(imeOpis);
		jp2.add(prezimeOpis);
		jp2.add(nazivOpis);
		jp2.add(pretrazi);
		
		vbar.setBounds(50, 300, 400, 100);
		ispis.setBounds(50, 300, 400, 100);
		pretraga.setBounds(50, 40, 200, 20);
		imeOpis.setBounds(50, 100, 200, 20);
		prezimeOpis.setBounds(50, 150, 200, 20);
		nazivOpis.setBounds(50, 200, 200, 20);
		ime.setBounds(150, 100, 200, 20);
		prezime.setBounds(150, 150, 200, 20);
		naziv.setBounds(150, 200, 200, 20);
		pretrazi.setBounds(200, 250, 100, 20);
		
//		Tab3
		final JTextField broj1 = new JTextField(10);
		final JTextField imeAutora1 = new JTextField(20);
		final JTextField prezimeAutora1 = new JTextField(20);
		final JTextField naslov1 = new JTextField(20);
		final JTextField brojStranica1 = new JTextField(20);
		final JTextField izdavac1 = new JTextField(20);
		final JTextField clan1 = new JTextField(20);
		
		final JLabel brojOpis1 = new JLabel("Broj knjige:");
		final JLabel imeAutoraOpis1 = new JLabel("Ime autora:");
		final JLabel prezimeAutoraOpis1 = new JLabel("Prezime autora:");
		final JLabel naslovOpis1 = new JLabel("Naslov knjige:");
		final JLabel brojStranicaOpis1 = new JLabel("Broj stranica:");
		final JLabel izdavacOpis1 = new JLabel("Izdavac knjige:");
		final JLabel clanOpis1 = new JLabel("Clan:");
		
		jp3.add(broj1);
		jp3.add(imeAutora1);
		jp3.add(prezimeAutora1);
		jp3.add(naslov1);
		jp3.add(brojStranica1);
		jp3.add(izdavac1);
		jp3.add(clan1);
		jp3.add(brojOpis1);
		jp3.add(imeAutoraOpis1);
		jp3.add(prezimeAutoraOpis1);
		jp3.add(naslovOpis1);
		jp3.add(brojStranicaOpis1);
		jp3.add(izdavacOpis1);
		jp3.add(clanOpis1);
		
		broj1.setBounds(150, 50, 200, 20);
		imeAutora1.setBounds(150, 100, 200, 20);
		prezimeAutora1.setBounds(150, 150, 200, 20);
		naslov1.setBounds(150, 200, 200, 20);
		brojStranica1.setBounds(150, 250, 200, 20);
		izdavac1.setBounds(150, 300, 200, 20);
		brojOpis1.setBounds(50, 50, 200, 20);
		imeAutoraOpis1.setBounds(50, 100, 200, 20);
		prezimeAutoraOpis1.setBounds(50, 150, 200, 20);
		naslovOpis1.setBounds(50, 200, 200, 20);
		brojStranicaOpis1.setBounds(50, 250, 200, 20);
		izdavacOpis1.setBounds(50, 300, 200, 20);
		
//		Tab4
		final JButton prikazi = new JButton("Prikazi");
		final JButton izbrisi = new JButton("Izbrisi");
		final JTextField brojKnjige = new JTextField(10);
		final JLabel brojKnjigeOpis = new JLabel("Redni broj knjige:");
		final JTextArea knjigaZaBrisanje = new JTextArea();
		
		
		jp4.add(prikazi);
		jp4.add(izbrisi);
		jp4.add(brojKnjige);
		jp4.add(brojKnjigeOpis);
		jp4.add(knjigaZaBrisanje);
		
		knjigaZaBrisanje.setBounds(50, 150, 200, 100);
		prikazi.setBounds(300, 100, 100, 20);
		brojKnjigeOpis.setBounds(50, 100, 200, 20);
		brojKnjige.setBounds(170, 100, 100, 20);
		izbrisi.setBounds(200, 250, 100, 20);
		
		izbrisi.setVisible(false);
		knjigaZaBrisanje.setVisible(false);
		knjigaZaBrisanje.setEditable(false);
		knjigaZaBrisanje.setBorder(UIManager.getBorder("Label.border"));
		knjigaZaBrisanje.setBackground(UIManager.getColor("Label.background"));
		
//		Dugme dodaj knjigu
		ActionListener al = new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String b = imeAutora.getText();
				String c = prezimeAutora.getText();
				String d = naslov.getText();
				int e = Integer.parseInt(brojStranica.getText());
				String f = izdavac.getText();
				
				KnjigaDao knjigaDao = new KnjigaDaoImpl();
				Knjiga knjiga = new Knjiga(b, c, d, e, f);
				try{
					knjigaDao.novaKnjiga(knjiga);
					potvrda.setText("Knjiga uspjesno dodata!");
					imeAutora.setText("");
					prezimeAutora.setText("");
					naslov.setText("");
					brojStranica.setText("");
					izdavac.setText("");
				}catch(Exception ex){
					potvrda.setText("Greska!");
				}
			
			}
		};
		dodaj.addActionListener(al);
		
//		Dugme pretrazi knjige
		ActionListener al1 = new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String a = ime.getText();
				String b = prezime.getText();
				String c = naziv.getText();
				
				KnjigaDao knjigaDao = new KnjigaDaoImpl();
				try {
					ArrayList<Knjiga> knjige = knjigaDao.prikaziKnjige(a, b, c);
					ispis.setText("");
					for (int i = 0; i < knjige.size(); i++) {
						if (knjige.get(i) != null) {
							ispis.append(knjige.get(i).getBroj() + " " + knjige.get(i).getImeAutora() + " "
							+ knjige.get(i).getPrezimeAutora() + " " + knjige.get(i).getNaslov() + " "
							+ knjige.get(i).getBrojStranica() + " " + ((knjige.get(i).getImeClana() == null) ? "" : knjige.get(i).getImeClana()) + "\n");					
						}
						ime.selectAll();
						prezime.selectAll();
						naziv.selectAll();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		};
		pretrazi.addActionListener(al1);
		
//		Dugme prikazi knjigu za brisanje
		ActionListener al4 = new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				int a = Integer.parseInt(brojKnjige.getText());
				
				KnjigaDao knjigaDao = new KnjigaDaoImpl();
				try {
					Knjiga knjiga = knjigaDao.prikaziKnjigu(a);
					knjigaZaBrisanje.setVisible(true);
					if(knjiga.getBroj() != 0){						
						knjigaZaBrisanje.setText("Ime autora: " + knjiga.getImeAutora() + "\nPrezime autora: " + knjiga.getPrezimeAutora() +
								"\nNaziv knjige: " + knjiga.getNaslov() + "\nIzdavac: " + knjiga.getIzdavac());
						izbrisi.setVisible(true);
					}else{
						knjigaZaBrisanje.setText("Knjiga pod rednim brojem " + a + "\nne postoji u bazi!");
						izbrisi.setVisible(false);
					}
						
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		};
		prikazi.addActionListener(al4);
		
//		Dugme izbrisi knjigu
		ActionListener al5 = new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				int a = Integer.parseInt(brojKnjige.getText());
				
				KnjigaDao knjigaDao = new KnjigaDaoImpl();
				try {
					knjigaDao.brisiKnjigu(a);
					knjigaZaBrisanje.setText("Knjiga je uspjesno izbrisana!");
					izbrisi.setVisible(false);
					brojKnjige.setText(null);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		};
		izbrisi.addActionListener(al5);
	}


}
