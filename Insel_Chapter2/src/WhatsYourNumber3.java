/**
 * Example - WhatsYourNumber3:
 * if / continue			
 * page 194
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */


public class WhatsYourNumber3 {
	
	public static void main (String[] args) {
		
		/*// testing math.random
		double a =  (int) (Math.random()*100);
		System.out.println(a);
		*/
		
		int number = (int) (Math.random() * 5 + 1);
		
		while (true) {
			System.out.println( "Welche Zahl rate ich [1,5]?" );
			int guess = new java.util.Scanner( System.in).nextInt();
			
			if (guess < 1 || guess > 5 ) {
				System.out.println( "Nur Zahlen zwischen 1 und 5 erlaubt!" );
				continue;													// test condition; go back to beginning of loop
			}
			
			if ( number == guess ) {
				System.out.println("Richtig geraten");
				break;
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
