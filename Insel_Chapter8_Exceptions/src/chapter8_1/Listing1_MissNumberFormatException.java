package chapter8_1;

/**
 * Exception Example 1 
 * (page 555)
 * 
 * 
 * @author Oliver Zott
 * @version 1.1 (2019-08-24 / 2020-01-29) 
 */


public class Listing1_MissNumberFormatException {

		public static int getVatRate() {
			return Integer.parseInt( "19%" );
		}
		
		public static void main( String[] args ) {
			
			System.out.println(getVatRate());
			
		}
}

