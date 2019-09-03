/**
 * Exception Example 2 - Catch Exception 
 * (page 557)
 * 
 * 
 * TODO:	- read input function
 * 			- Functions to parse values 
 * 
 * @author Oliver Zott
 * @version 1.0 / 24.08.2019
 */
public class CatchNumberFormatException {
	
	public static void main( String[] args ) {
		
		String stringToConvert = "19%";
		double vat = 19;
		
		try {
			vat = Integer.parseInt( stringToConvert);
		}
		catch ( NumberFormatException e ) {		// e references exception object (exceptions are objects!)
			System.err.printf("%s can not be converted to integer! %n", stringToConvert); 	// %n for line break in printf
		}
		
		System.out.printf(" Continuing script: '%s'. %n", vat);
		
	}
}
