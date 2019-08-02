/**
 * Example - Calculator:
 * switch / case / fall-through		
 * page 179
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */


public class SimpleYearMonthParser {

	
	@SuppressWarnings("resource")							// Annotations ???
	public static void main(String[] args) {
		// String date = "17 12";							// String (class & data type --> S.334)
		
		System.out.println ( "Bitte Datum eingeben ('YY MM', 'YYYY MM', 'MM')" );
		String date = new java.util.Scanner( System.in ).nextLine() ;
		
		
		int month = 0, year = 0;
		java.util.Scanner scanner = new java.util.Scanner( date );			// ???
		
		switch ( date.length() ) {
			case 5:											// YY MM
				year = 2000;								// Fall-Through: if case 5 -> next case 2000 + input!
			case 7:
				year += scanner.nextInt();					// Fall-Through: case 5 skiped -> year = 0
			case 2:
				month = scanner.nextInt();					
				
				if (year == 0) {
					year = java.time.Year.now().getValue();
				}
				break;
			default:
				System.err.println( "Falsches Format" );				
		}
		
		System.out.println( "Monat=" + month + ", Jahr=" + year);
	}
}
