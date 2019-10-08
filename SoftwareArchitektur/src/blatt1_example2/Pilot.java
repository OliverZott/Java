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


package blatt1_example2;


import java.time.LocalDateTime;
import java.time.Month;
//import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Pilot {
	
	private String surname = "";
	private String id = "";
	private String type_rating = "";
	private LocalDateTime rest_time = LocalDateTime.of(2000, Month.JANUARY, 1 , 00, 01);

	
	/* Setter and Getter Methods */
	

	public String getType_rating() {
		return type_rating;
	}

	public void setType_rating(String type_rating) {
		this.type_rating = type_rating;
	}

	public LocalDateTime getRest_time() {
		return rest_time;
	}

	public void setRest_time(LocalDateTime rest_time) {
		this.rest_time = rest_time;
	}


	public String getSurname() {
		return this.surname;
	}
	
	
	public void setSurname(String name) {
		this.surname = name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getRating() {
		return this.type_rating;
	}
	
	public void setRating( String rating ) {
		this.type_rating = rating;
	}
	
	
	
	/* Methods for class pilot */
	public static boolean restTimeCheck( LocalDateTime rest_time, LocalDateTime to ) {
		
		boolean trigger = false;
		LocalDateTime time1 = LocalDateTime.from(rest_time);
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
