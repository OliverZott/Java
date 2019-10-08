/**
 * Enum - objects
 * (page 430)
 * 
 * Author: Oliver Zott
 * Date: 05.10.2019
 */

package enum_const;

import java.util.Scanner;


public class Example1_Weekday {
	
	public enum Weekday {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	public static boolean isWeekend( Weekday day ) {
		return day == Weekday.SATURDAY || day == Weekday.SUNDAY;
	}
	
	public static String input () {
		
		Scanner in = new Scanner( System.in );
		System.out.println("Please enter a weekday (in english): ");
		String input_text = in.nextLine();
		in.close();
		return input_text;
	}
	
	public static void garfield( Weekday day) {
		if (day == Weekday.MONDAY) {
				System.out.println("I hate Mondays (Garfield).");
		}
	}
	
	
	public static void main( String[] args) {
		
		// String day1 = input();

		garfield(Weekday.MONDAY);

	}
}


