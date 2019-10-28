package ex1_solution1;


import java.time.LocalDateTime;
import java.time.Month;


public class Pilot extends Staff {
	
	private String type_rating;
	private LocalDateTime timestamp;
	private LocalDateTime rest_time;
	
	public Pilot( String name, String id, String type_rating) {
		super(name, id);
		this.type_rating = type_rating;
	}
	
	
}
