/** 
 * Example - Packages (date)
 * page 252
 * 
 * source: 		https://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
 * 				https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
 * 				https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
 * 
 * 
 * @author:		Oliver Zott
 * @date:		10.08.2019
 * @version:	1.0
 */

package date;		// page 252

import java.time.LocalDate;
import java.time.LocalDateTime;	
import java.time.format.*;


public class DatePrinter {
	
	public static void printCurrentDate() {
		DateTimeFormatter formatter =
				DateTimeFormatter.ofLocalizedDate( FormatStyle.MEDIUM);
		System.out.println( LocalDate.now().format(formatter));
		
		// LocalDateTime
		System.out.println();
		System.out.println("java.time.LocalDate: ");	
		
		
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY:MM:DD - HH:mm:ss");
		System.out.println(dtf.format(time));
		
	}
}


