package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	
	private final String USERNAME = "root";
	private final String PASSWORD = "";
	private final String URL = "jdbc:mysql://localhost:3306/pts";
	
	Connection con = null;
	Statement st = null;
	
	public void createConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD) ;
			if(con!= null) {
				st = con.createStatement();
				System.out.println("Connection Success");
			}
			else{
				System.out.println("Connection failed");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
