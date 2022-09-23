package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/dbagenda?useTimezone=true%serverTimezone=UTC";
	String user = "root";
	String password = "root";
	
	private Connection conectar() {
		Connection con = null;
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, user, password);	
		}catch (Exception e) {
			System.out.println(e.getMessage());			
		}
		
		return con;
	}
	
	public void testeConexao() {
		this.conectar();
	}
}
