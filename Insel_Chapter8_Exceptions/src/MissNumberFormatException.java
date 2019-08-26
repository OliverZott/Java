/**
 * Exception Example 1 
 * (page 555)
 * 
 * 
 * @author Oliver Zott
 * @version 1.0 / 24.08.2019
 */


public class MissNumberFormatException {

	public static int getVatRate() {
		return Integer.parseInt( "19%" );
	}
	
	public static void main( String[] args ) {
		System.out.println(getVatRate());
	}
}
