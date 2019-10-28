package ex1_example2;


import java.time.LocalDateTime;
import java.time.Month;

import ex1_example2.Pilot;

public class Test {
	
	public static void main(String[] args ) {
		
		
		/* Test.. */
		LocalDateTime time = LocalDateTime.of(2000, Month.JANUARY, 1 , 00, 01);
		Pilot p1 = new Pilot("Herbert", "id1", "Airbus", time);
		Pilot p2 = new Pilot("Dominik", "id2", "Boeing", time);
		Pilot p3 = new Pilot("Sepp", "id3", "Boeing", time);
		System.out.println("p2 last Flight: " + p2.time_last);
		
		LocalDateTime time_dep = LocalDateTime.of(2019, Month.OCTOBER, 14 , 17, 20);
		Flight f1 = new Flight("f1", "Boeing", time_dep, p2, p3);
		f1.getFlight(f1);
		
		System.out.println();
		System.out.println("p2 last Flight: " + p2.time_last);
		
	}

}
