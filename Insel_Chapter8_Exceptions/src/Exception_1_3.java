/**
 * Exception Handling: Example 1.3
 * 
 * source: https://beginnersbook.com/2013/04/java-checked-unchecked-exceptions-with-examples/
 * 
 * @author Oliver Zott
 * @version 1.1 / 09.09.219
 */

import java.io.*;

public class Exception_1_3 {
	
	
	/* BETTER WAY OF EXCEPTION HANDLING --> Try ... catch */
	public static void main( String[] args ) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\Dura\\eclipse-workspace\\Insel_Chapter8_Exceptions\\test.txt");
		} catch( FileNotFoundException fnfe ) {
			System.out.println( "Error - File not found: " + fnfe);
		}
		
		int k;
		
		try {
			while( ( k = fis.read() ) != -1 ) {
				System.out.print( (char)k );
			}
			fis.close();
		} catch( IOException ioe) {
			System.out.printf("Error (%s): IO Exception occured! %n", ioe);
			
		}
	
		
	}
	
}
