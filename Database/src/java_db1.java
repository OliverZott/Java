/**
 * Java/MySQL: Create Database
 * 
 * source: https://www.tutorialspoint.com/jdbc/jdbc-create-database.htm
 * 
 * TimeZone-Error: https://stackoverflow.com/questions/26515700/mysql-jdbc-driver-5-1-33-time-zone-issue
 * 
 * @author Oliver Zott
 * @version 1.0 / 02.09.2019
 */


import java.sql.*;

public class java_db1 {
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	// Database credentials
	static final String USER = "root";   
	static final String PASS = "";
	
	public static void main( String[] args ) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// Register JDBC driver (class to load driver)
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Open a connection
			System.out.println("Connectiong to database... ");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			
		} catch(SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch(Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
		
		
	}

}
