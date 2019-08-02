/**
 * Example - WhatsYourNumber:
 * if, else if / do-while / random 			
 * page 166 / 184
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */

// import java.util.*;										// to avoid every tie java.util.

public class WhatsYourNumber {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 5 + 1);
		int guess;										// do-while: variable has to be declared outside loop!
		
		do {
		System.out.println("Welche Zahl denke ich mir zwischen 1 und 5?");
		// int guess = new java.util.Scanner( System.in ).nextInt();		
		guess = new java.util.Scanner( System.in ).nextInt();
		
		
		if ( number == guess) {
			System.out.println("Super getippt!");
		}
		else if(number < guess ) {
			System.out.println("Die Zahl ist kleiner");
		}
		else if ( number > guess) {
			System.out.println("Die Zahl ist groesser");
		}
		}
		while (number != guess);
	}
}