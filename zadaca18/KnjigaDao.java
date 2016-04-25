package zadaca18;

import java.sql.SQLException;
import java.util.ArrayList;

public interface KnjigaDao{
	
	public void novaKnjiga(Knjiga knjiga) throws SQLException;
	public Knjiga prikaziKnjigu(int broj) throws SQLException;
	public void brisiKnjigu(int broj) throws SQLException;
	public void izmjeniKnjigu(Knjiga knjiga, int broj) throws SQLException;
	public ArrayList<Knjiga> prikaziKnjige(String a, String b, String c)
			throws SQLException;

}
