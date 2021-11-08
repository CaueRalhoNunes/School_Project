package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionDAO {
	public Connection conectaBD() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/bd_school?user=root&password=1234";
			conn = DriverManager.getConnection(url);
			
		} catch (SQLException error) {
			JOptionPane.showMessageDialog(null, "ConnectionDAO" + error.getMessage());
		}
		return conn;
	}

}
