package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
		}catch (Exception e) {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
