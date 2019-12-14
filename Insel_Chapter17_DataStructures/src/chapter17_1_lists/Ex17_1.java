package chapter17_1_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Chapter 17.1
 * List-Example (page 980)
 * 
 * The example takes a city as input value and stores it. 
 * Then you have to input the right order of all added cities so far.
 * 
 * @author Oliver Zott
 * @version 1.0 (2019.12.02)
 */

public class Ex17_1 {
	
	//@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<String>();
		
		while(true) {
			System.out.println("Which city will be added?");
			String newCity = new Scanner(System.in).nextLine();
			cities.add(newCity);
			
			System.out.printf("What does the route looks like? (Tipp: %d %s)%n",
					cities.size(), cities.size() == 1 ? "City" : "Cities");
		
			for (String city : cities) {
				String guess = new Scanner(System.in).nextLine();
				if(! city.equalsIgnoreCase(guess)) {
					System.out.printf("%s is wrong, %s would be correct.%n", guess, city);
					return;
				}
			}
			System.out.println("Congratulations, answear is correct!");
		}	
	}
}
