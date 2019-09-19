package com.revature.projectone.howard.util;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class ConnectionUtil {
		
		private static Connection connection;
		
		public static Connection getConnection() throws SQLException {
			
			//set up envoirment variables do not hard code it be
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			// should not hard credentials
			String url = System.getenv("DB_URL");
			String username = System.getenv("DB_USER");
			String password = System.getenv("DB_PASS");
			
			if(connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(url, username, password);
			
			
		}
			return connection;
		}
	}
