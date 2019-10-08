/**
 * Standard input / output
 * 
 * - Buffered Reader Class (Java classical method)
 * - Scanner Class (most preferred method)
 * - Console Class (e.g. for password reading)
 * 
 * -  Parser: Integer.parseInt(), Double.parseDouble()
 * 
 * source:	- https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
 * 			- https://www.geeksforgeeks.org/difference-between-scanner-and-bufferreader-class-in-java/
 * 			- https://stackoverflow.com/questions/2231369/scanner-vs-bufferedreader
 * 		
 * 	
 * TODO:	- Scanner class always scans as string...wtf ?
 * 
 * @author Oliver Zott
 * @version 1.0 / 24.08.2019
 */

// Buffered Reader imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Scanner Class import
import java.util.Scanner;
import java.util.InputMismatchException;

public class StdIO {

	
	// implementing Buffered Reader version
	public static void iofunc1() {
		
		System.out.println( "Buffered Reader: Please enter a string: ");
		
		// enter data using buffered reader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// reading data using read.line
		try {
			String data = reader.readLine();
			System.out.println( "You enterd: " +  data );
		}
		catch( IOException e ) {		// catch BufferedReader exception
			System.err.printf( "%s can not be read! %n", reader);
		}
		
	}
	
	
	// implementing Scanner Class version
	public static void iofunc2() {
		
		System.out.println( "Scanner Class: Please enter a string: ");
		
		// using scanner for getting input
		Scanner in = new Scanner( System.in );
		
		try {
			String s = in.nextLine();
			System.out.println( "You enterd string: " + s );
			
			int i = in.nextInt();
			System.out.println( "You enterd integer: " + i );
			
			float f = in.nextFloat(); 
	        System.out.println( "You entered float " + f ); 
		}
		catch ( InputMismatchException e ) {
			System.err.printf( "%s does not match expected input type", in);
		}
		
        in.close();
        
	}
	
	
	/*implementing Console Class version is not working in IDEs!
	public static void iofunc3() {
		
		System.out.println( "Console Class: Please enter a string: ");
		
		String name  = System.console().readlLine();
		
		System.out.println( "You entered: " + name);
		
	}
	*/
	
	
	public static void main( String[] args ) {
		iofunc1();
		iofunc2();
		
	}
}
