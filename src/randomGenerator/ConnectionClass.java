package randomGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {
	public static String Driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://127.0.0.1:3306/mcq";
	public static String address = "root";
	public static String password = "Nolanross123!!!";
	public static Connection conn = null;
	public static Statement stmt = null;

	public void createConnection() throws ClassNotFoundException, SQLException {
		Class.forName(Driver);
		conn = DriverManager.getConnection(url, address, password);
		stmt = conn.createStatement();
		System.out.println("Connection Established");
	}
	

}
