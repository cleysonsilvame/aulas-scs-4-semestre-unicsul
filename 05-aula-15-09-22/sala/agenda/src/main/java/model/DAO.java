package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	String user = "root";
	String password = "root";

	private Connection conectar() {
		Connection con = null;

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);
		}

		return con;
	}

	public void testeConection() {
		conectar();
	}

	public void insert(Javabeans payload) {
		Connection con = this.conectar();

		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO contatos VALUES (0, ?, ?, ?)");

			ps.setString(1, payload.getNome());
			ps.setString(2, payload.getFone());
			ps.setString(3, payload.getEmail());

			ps.execute();

			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Javabeans> listarContatos() {
		Connection con = this.conectar();

		ArrayList<Javabeans> contatos = new ArrayList<>();
		String sql = "SELECT * FROM contatos ORDER BY name";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String idCon = rs.getString(1);
				String nome = rs.getString(2);
				String fone = rs.getString(3);
				String email = rs.getString(4);
				
				contatos.add(new Javabeans(idCon, nome, fone, email));
			}

			ps.close();
			con.close();
			
			return contatos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}
}
