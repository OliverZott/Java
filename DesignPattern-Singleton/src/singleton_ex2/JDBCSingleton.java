/**
 * Singleton Example: JDBC and CRUD
 * 
 * 
 * 
 * 
 * source: https://www.javatpoint.com/singleton-design-pattern-in-java
 * 
 * 
 * - line 28: ??? instance inside class ???
 * - line 41: ??? why no typ before variable name ???
 * 
 * Oliver Zott
 * Date: 08.09.2019
 * Updte: 19.09.2019
 */

package singleton_ex2;

import java.io.BufferedReader;	// for read line stuff
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;  
import java.sql.SQLException;





public class JDBCSingleton {
	/* 
	 * Step 1: Create JDBC-Singleton-Class.
	 * Static member holds only one instance of the JDBCSingleton class.
	 */
	private static JDBCSingleton jdbc;  // JDBCSingleton instance (field)
	
	
	// JDBCSingleton prevents initiation from any other class by private constructor:
	private JDBCSingleton() { }
	
	
	// Provide global points of access 
	public static JDBCSingleton getInstance() {
		
		if (jdbc == null ) {
			// JDBCSingleton jdbc = new JDBCSingleton();
			jdbc = new JDBCSingleton();
		}
		return jdbc;
		
	}
	
	
	
	// Stuff for Connection:
	static final String DB_URL = "jdbc:mysql://localhost?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static final String USER = "root";   
	static final String PASS = "";
	 
	
	// Get Connection from methods like insert, view, ...
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
				
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(DB_URL, USER, PASS);
		return con;
	}
	
}

