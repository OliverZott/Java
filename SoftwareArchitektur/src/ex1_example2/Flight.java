
package ex1_example2;

import java.time.LocalDateTime;
import java.time.Month;


public class Flight {

	/* Class Attributes and Setter/Getter methods */
	String id = "";
	String typerating = "";
	int seat_max = 0;
	int seat_taken = 0;
	String Abflugsort = "";
	String Destination = "";
	LocalDateTime time_depart; 
	Pilot pilot;
	Pilot fo;
	
	//LocalDateTime pilot_rest_time = pilot.time_last;
	//LocalDateTime fo_rest_time = fo.time_last;
	
	
	/* Constructor to create flight depending on pilot */
	
	Flight( String id, String typerating, LocalDateTime time_depart, Pilot pilot, Pilot fo ) {
		this.id = id;
		this.typerating = typerating;
		this.time_depart = time_depart;
		
		if ( setPilot( pilot ) ) {
			System.out.println("Crew member accepted!");
			this.pilot = pilot;
			pilot.time_last = time_depart;
		}
		
		if( setPilot(fo) ) {
			System.out.println("Crew member accepted!");
			this.fo = fo;
			fo.time_last = time_depart;
		}
		
	}
	
	public void getFlight(Flight flight) {
		System.out.println("Flugnummer: " + this.id);
		System.out.println("Flugzeugtyp: " + this.typerating);
		System.out.println("Abflugzeit: "  + this.time_depart);
		System.out.println("Capitain: " + this.pilot.surname);
		System.out.println("Copilot: " + this.fo.surname);
	}
	
	
	/* Functions to check if pilot is OK. */
	public boolean setPilot( Pilot pilot) {
		
		boolean trigger = false;
		
		if (pilot.restTimeCheck(pilot , time_depart)) {
			trigger = true;
		} else {
			trigger = false;
			System.out.println("Error... rest time!");
		}
		
		if ( pilot.typeRatingCheck(typerating)) {
			trigger = true;
		} else {
			trigger = false;
			System.out.println("Error... type rating wrong!");
		}
		return trigger;
	}
	
	
	
}
