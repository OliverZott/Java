/**
 * Example - WhatsYourNumber2:
 * if / break			
 * page 192
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */


public class WhatsYourNumber2 {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 5 + 1 );
		
		while (true) {
			System.out.println ( "Welche Zahl denke ich mir [0,5]");
			int guess = new java.util.Scanner( System.in ).nextInt();
			
			if (number == guess) {
				System.out.println("Richtig geraten!");
				break;												// end infinite-loop
			}
			else if (number > guess) {
				System.out.println("Zahl ist groesser!");
			}
			else if (number < guess ) {
				System.out.println("Zahl ist kleiner!");
			}
		}
	}

}
