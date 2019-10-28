package blatt1_example2;

import java.time.LocalDateTime;


public class Flight2 {

	/* Class Attributes and Setter/Getter methods */
	private String id = "";
	private int seat_max = 0;
	private int seat_taken = 0;
	private String Abflugsort = "";
	private String Destination = "";
	private LocalDateTime date_time; 
	private Pilot2 pilot;
	private Pilot2 fo;
	
	public LocalDateTime pilot_rest_time = pilot.getRest_time();
	public LocalDateTime fo_rest_time = fo.getRest_time();
	
	
	public LocalDateTime getDate_time() {
		return date_time;
	}

	public void setDate_time(LocalDateTime date_time) {
		this.date_time = date_time;
	}
	
	public int getSeat_max() {
		return seat_max;
	}

	public void setSeat_max(int seat_max) {
		this.seat_max = seat_max;
	}

	public int getSeat_taken() {
		return seat_taken;
	}

	public void setSeat_taken(int seat_taken) {
		this.seat_taken = seat_taken;
	}

	public String getAbflugsort() {
		return Abflugsort;
	}

	public void setAbflugsort(String abflugsort) {
		Abflugsort = abflugsort;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public Pilot2 getPilot_id() {
		return pilot;
	}

	public void setPilot( Pilot2 pilot) {
		if (pilot.restTimeCheck(pilot_rest_time, date_time)) {
			this.pilot = pilot;
		} else {
			System.out.println("Error... rest time!");
		}
	}
	public void setFo( Pilot2 fo) {
		if (fo.restTimeCheck(fo_rest_time, date_time)) {
			this.fo = fo;
		} else {
			System.out.println("Error... rest time!");
		}
	}

	public Pilot2 getFo() {
		return fo;
	}

	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
