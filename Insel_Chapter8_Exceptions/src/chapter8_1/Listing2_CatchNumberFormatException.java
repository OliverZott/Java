package chapter8_1;

/**
 * Exception Example 2 - Catch Exception 
 * (page 557)
 * 
 * 
 * TODO:	- read input function
 * 			- Functions to parse values 
 * 
 * @author Oliver Zott
 * @version 1.1 (2019-08-24 / 2020-01-29) 
 */

public class Listing2_CatchNumberFormatException {
	
	public static void main( String[] args ) {
		
		String stringToConvert = "19%";
		double vat = 19;
		
		try {
			vat = Integer.parseInt( stringToConvert);
		}
		catch ( NumberFormatException e ) {		
			// e references exception object (exceptions are objects!)
			System.err.printf("%s can not be converted to integer! %n", stringToConvert); 	
			e.printStackTrace();
			// %n for line break in printf
		}
		
		System.out.printf(" Continuing script with: '%s'. \n", vat);
	}
	
}
