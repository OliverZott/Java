/**
 * Non primitive arrays
 * page 281
 * 
 * @author Oliver Zott
 *
 */

import java.util.Scanner;


public class NonPrimitiveArray {
	
	
	public static void main( String[] args ) {
		
		String[] validInputs = {"Banane", "Apfel", "Kirsche"};
		
		boolean found = false;
		System.out.println("Input word: ");
		while ( ! found ) {
			String input = new Scanner( System.in ).nextLine();
			//Scanner scanner = new Scanner( System.in );
			//String input = scanner.nextLine();
		
			for ( String word: validInputs ) {
				if ( word.equals( input ) ) {
					found = true;
					System.out.print("Richtiges Wort");
					break;
				}
			}
		
			if ( ! found ) 
				System.out.println("Try again:");
		
			// scanner.close();
		}
	}
}	