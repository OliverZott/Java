/**
 * Example2: Convert char in uppercase
 * ( page 329)
 * 
 * @author Oliver Zott
 *
 */


import java.lang.Character;
import java.util.Scanner;

public class UppercaseWriter {
	
	public static void uppercaseWriter ( ) {
		
		System.out.println( "Please input sentence: ");
		String input = new Scanner( System.in ).nextLine();
		
		for ( int i = 0; i < input.length(); i++ ) {
			
			char c = input.charAt(i);
			
			if ( Character.isWhitespace( c ) )
				System.out.print( '_' );
			else if ( Character.isLetter( c ))
				System.out.print( Character.toUpperCase( c ) );
		}
		
	}

	public static void main( String[] args ) {
		
		uppercaseWriter();
		
	}
}
