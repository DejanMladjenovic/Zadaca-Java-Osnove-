package zadaca18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KnjigaDaoImpl implements KnjigaDao {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String CONN_STRING = "jdbc:mysql://localhost/biblioteka";

	@Override
	public void novaKnjiga(Knjiga knjiga) throws SQLException {
		String query = "INSERT INTO knjige(imeAutora, prezimeAutora, naslov, brojStranica, izdavac) "
				+ "VALUES('" + knjiga.getImeAutora() + "', '" + knjiga.getPrezimeAutora() + "', '"
				+ knjiga.getNaslov() + "', " + knjiga.getBrojStranica() + ", '" + knjiga.getIzdavac() + "')";

		try (Connection connection = DriverManager.getConnection(CONN_STRING,
				USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {

			statement.executeUpdate(query);
			System.out.println("Successfully updated the table.");
		} catch (SQLException e) {
			System.err.println(e.toString());
		}
	}

	@Override
	public ArrayList<Knjiga> prikaziKnjige(String a, String b, String c)
			throws SQLException {
		String query = "SELECT * FROM knjige WHERE ('" + a + "' <> '' AND imeAutora LIKE  '%" + a + "%') " 
				+ "OR ('" + b + "' <> '' AND prezimeAutora LIKE '%" + b + "%') " 
				+ "OR ('" + c + "' <> '' AND naslov LIKE '%" + c + "%')" 
				+ "OR ('" + a + "' = '' AND '" + b + "' = '' AND '" + c + "' = '')";
		ResultSet rs = null;
		ArrayList<Knjiga> knjige = new ArrayList<>();

		try (Connection connection = DriverManager.getConnection(CONN_STRING,
				USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {

			rs = statement.executeQuery(query);

			while (rs.next()) {
				knjige.add(new Knjiga(rs.getInt("broj"), rs
						.getString("imeAutora"), rs.getString("prezimeAutora"),
						rs.getString("naslov"), rs.getInt("brojStranica"), rs
								.getString("izdavac"), rs.getString("imeClana")));
			}
			rs.close();
		} catch (SQLException e) {
			System.err.println(e.toString());
		}
		return knjige;
	}

	@Override
	public Knjiga prikaziKnjigu(int broj) throws SQLException {
		String query = "SELECT * FROM knjige WHERE broj = " + broj;
		ResultSet rs = null;
		Knjiga a = new Knjiga();
		try (Connection connection = DriverManager.getConnection(CONN_STRING,
				USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {

			rs = statement.executeQuery(query);

			while (rs.next()) {
				a = new Knjiga(rs.getInt("broj"), rs.getString("imeAutora"),
						rs.getString("prezimeAutora"), rs.getString("naslov"),
						rs.getInt("brojStranica"), rs.getString("izdavac"),
						rs.getString("imeClana"));
			}
			rs.close();
		} catch (SQLException e) {
			System.err.println(e.toString());
		}
		return a;
	}

	@Override
	public void brisiKnjigu(int broj) throws SQLException {
		String query = "DELETE FROM knjige WHERE broj =" + broj;

		try (Connection connection = DriverManager.getConnection(CONN_STRING,
				USERNAME, PASSWORD);
		// java.sql.Statement
				Statement statement = connection.createStatement();) {
			// execute the query
			statement.executeUpdate(query);
			System.out.println("Successfully updated the table.");
		} catch (SQLException ex) {
			System.err.println(ex.toString());
		}

	}

	@Override
	public void izmjeniKnjigu(Knjiga knjiga, int broj) throws SQLException {
		String query = "UPDATE knjige SET imeAutora = '"
				+ knjiga.getImeAutora() + "', prezimeAutora = '"
				+ knjiga.getPrezimeAutora() + "', naslov = '"
				+ knjiga.getNaslov() + "', brojStranica = "
				+ knjiga.getBrojStranica() + ", izdavac = '"
				+ knjiga.getIzdavac() + "' WHERE broj = " + broj;
		try (Connection connection = DriverManager.getConnection(CONN_STRING,
				USERNAME, PASSWORD);

		Statement statement = connection.createStatement();) {
			statement.executeUpdate(query);
			System.out.println("Successfully updated the table.");
		} catch (SQLException ex) {
			System.err.println(ex.toString());
		}

	}

}
