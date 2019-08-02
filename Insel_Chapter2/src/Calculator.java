/**
 * Example - Calculator:
 * switch / case, default			
 * page 176
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println ("Bitte erste Zahl eingeben: ");
		double x = new java.util.Scanner( System.in).nextDouble();
		System.out.println ("Bitte Operator eingeben: ");
		char operator = new java.util.Scanner( System.in ).nextLine().charAt(0);
		System.out.println ("Bitte zweite Zahl eingeben: ");
		double y = new java.util.Scanner( System.in ).nextDouble();
		
		switch ( operator ) {
			case '+':
				System.out.println( x + y );
				break;
			case '-':
				System.out.println( x - y );
				break;
			case '*':
				System.out.println( x * y );
				break;
			case '/':
				System.out.println( x / y );
				break;
			default:
				System.err.println( "Unbekannter Operator - Error");
		}
	}

}
