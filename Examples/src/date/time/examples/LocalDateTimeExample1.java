package date.time.examples;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class LocalDateTimeExample1 {

	public static void main(String[] args ) {
		
	LocalDateTime date_time = LocalDateTime.now();
	System.out.println(date_time);
	
	LocalDateTime time0 = LocalDateTime.of(2019, Month.OCTOBER, 7 , 16, 23);
	LocalDateTime time2 = LocalDateTime.of(2019, Month.OCTOBER, 7 , 18, 47);
	System.out.println(time0);
	System.out.println(time2);
	System.out.println();
	
	LocalDateTime time1 = LocalDateTime.from(time0);
	
	long hours = time1.until(time2, ChronoUnit.HOURS);
	time1 = time1.plusHours(hours);
	
	System.out.println("stunden: "+ hours);
	System.out.println();
	
	DateTimeFormatter time_format = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:m");
	
	String formattedDate = date_time.format(time_format);
	System.out.println(formattedDate);
	
	}
	
	
}
