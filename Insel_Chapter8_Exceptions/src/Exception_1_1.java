/**
 * Exception Handling: Example 1.1
 * 
 * - CHECKED Exceptions (Compile Time)
 * 
 * source: https://beginnersbook.com/2013/04/java-checked-unchecked-exceptions-with-examples/
 * 
 * @author Oliver Zott
 * @version 1.1 / 09.09.219
 */

import java.io.*;

public class Exception_1_1 {
	
	
	/* wont work without "throws IOException"!! */
	public static void main( String[] args )  {
		
		
		/* Constructor FIleInputStream(filename) - throws FIleNotFound Exception
		 * which is CHECKED exception -> compile time -> compilation error */
		FileInputStream fis = null;
		fis = new FileInputStream("C:\\Users\\Dura\\eclipse-workspace\\Insel_Chapter8_Exceptions\\test.txt");
		int k;
		
		
		/* read() - throws IOException (checked exception) */
		while( ( k = fis.read() ) != -1 ) {
			System.out.print( (char)k );
		}
		
		/* Closes FileInputStream - throws IOException */
		fis.close();
		
	}
	
}
