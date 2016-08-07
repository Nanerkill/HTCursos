package market.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch(ClassNotFoundException e) {
			throw new RuntimeException("Error loading class...", e);
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Mk2", "postgres", "123eja123");
			return con;
		} catch(SQLException e) {
			throw new RuntimeException("Error connecting...", e);
		}
		
		/*
		 * catch(SqlException | ClassNotFoundException)
		 *  bla bla
		 */
	}

}
