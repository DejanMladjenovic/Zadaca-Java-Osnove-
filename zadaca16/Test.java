package zadaca16;

/**
 * Naziv klase: Test
 * 
 * @author Dejan Mladjenovic
 */

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		BazaPodataka test = new BazaPodataka();
//		test.baza();
//		test.tabela();
		test.insert(1, "'Prokleta avlija'", "'Ivo Andric'", 1962);
		test.insert(2, "'Dervis i smrt'", "'Mesa Selimovic'", 1966);
		test.insert(3, "'Bakonja fra Brne'", "'Simo Matavulj'", 1892);
		test.loopin();

	}

}
