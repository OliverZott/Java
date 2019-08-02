/**
 * Example - IfElse:
 * if, else / Dangling-else-Problem		
 * page 170
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */

public class IfElse {

	public static void main(String[] args) {
		System.out.println("Bitte Zahl eingeben: ");
		int input = new java.util.Scanner( System.in ).nextInt();
		
		if ( input >= 0 ) {
			if ( input !=0 ) {
				System.out.println("Ihre Zahl ist echt groesser 0");
			}
			else {
				System.out.println("Input = 0");
			}}
			else {
				System.out.println("Ihre Zahl ist echt kleiner als 0"); 
			}
	}
}
