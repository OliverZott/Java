/**
 * IsNumeric - test if string only integer
 * page 327
 * 
 * @author Oliver Zott
 *
 */

import java.lang.Character;

public class IsNumeric {

	public static boolean isNumeric( String str ) {
		
		boolean trigger = true;
		
		if ( str == null || str.length() == 0 ) {
			trigger = false;
			return trigger;
		}
		
		for ( int i = 0; i < str.length(); i++) {
			if ( ! ( Character.isDigit( str.charAt( i ) ) ) ) {
				trigger = false;
				break;
			}
			//else 
				//System.out.printf( "char on position %s is numeric. %n ", i );
		}
	
	return trigger;
	}
	
	
	public static void main( String[] args ) {
		
		String test_str = "21563478";
		String test_str2 = "234fg1563478";
		String test_str3 = "";
		
		System.out.println("Tested string is numeric?: " +  isNumeric(test_str3));
	}
	
}
