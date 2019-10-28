/**
 * Example 2 - Pilot Class
 * 
 * 
 * sources:
 *  - https://kodejava.org/how-to-find-the-difference-between-two-localdatetime-objects/
 *  - https://www.w3schools.com/java/java_date.asp
 *  
 *  
 *  
 * Oliver Zott
 * 07.10.2019
 */


package ex1_example2;


import java.time.LocalDateTime;
import java.time.Month;
//import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Pilot {
	
	public String surname = "";
	public String id = "";
	public String type_rating = "";
	public LocalDateTime time_last = LocalDateTime.of(2000, Month.JANUARY, 1 , 00, 01);

	
	/* Constructor for class pilot */
	Pilot (String name, String id, String type_rating, LocalDateTime rest_time ) {
		this.surname = name;
		this.id = id;
		this.type_rating = type_rating;
		this.time_last = rest_time;
	}
	
	
	/* Methods for class pilot */
	public boolean restTimeCheck( Pilot pilot, LocalDateTime to ) {
		
		boolean trigger = false;
		LocalDateTime time1 = LocalDateTime.from(pilot.time_last);
		long hours = time1.until(to, ChronoUnit.HOURS);
		
		if (hours > 12) {
			trigger = true;
		} 
		/*else {
			System.out.printf("Only %s hours since last flight!", hours);
		}
		//*/
		
		return trigger;
	}
	
	
	// check if type rating is correct
	public boolean typeRatingCheck( String type ) {
		boolean trigger = false;
		
		if (this.type_rating == type) {
			trigger = true;
		} 
		else {
			System.out.println("error...wrong type rating!");
		}
		
		return trigger;
	}
	
	
	public static void main(String[] args ) {
	
		/* Testint rest time check
		LocalDateTime time0 = LocalDateTime.of(2019, Month.OCTOBER, 7 , 23, 23);
		LocalDateTime time2 = LocalDateTime.of(2019, Month.OCTOBER, 8 , 4, 47);
		
		restTimeCheck(time0, time2);
		System.out.println(restTimeCheck(time0, time2));
		
		LocalDateTime date_time = LocalDateTime.now();
		System.out.println(date_time);
		//*/

	}
	
}
