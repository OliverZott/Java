/**
 * Chapter 17.2 - Sets
 * 
 * - HashSet
 * - TreeSet
 * - TreeSet (COPY)
 * 
 * 
 * @author Oliver Zott
 * @date 28.12.2019
 */


package chapter17_2_sets;

import java.text.BreakIterator;
import java.util.*;


public class Ex17_3_Sets {
	
	public static void main(String[] args) {
		
		
		// Create set with cities
		Set<String> allCities = new HashSet<>();
		allCities.add("Innsbruck");
		allCities.add("Telfs");
		allCities.add("Lienz");
		allCities.add("Mutters");
		allCities.add("Hammburg");
		
		// Create Set for visited cities
		Set<String> visitedCities = new TreeSet<>();
		
		
		// Example sentence - parsed and disassembled to store
		// city names in it in new data-structure 
		String sentence = "Driving from Innsbruck to Lienz and back to Mutters.";
		
		System.out.println("Original sentence: '" + sentence + "' \n");
		BreakIterator boundary = BreakIterator.getWordInstance();
		boundary.setText(sentence);
		
		for(int first = boundary.first(), last = boundary.next();
				last != BreakIterator.DONE;
				first = last, last = boundary.next()) 
		{
			String word = sentence.substring(first, last);
			if(allCities.contains(word))
			{
				visitedCities.add(word);
			}
		}
		System.out.println("Visited cities: " + visitedCities +"\n");
		System.out.println("Class of 'visitedCities': " + visitedCities.getClass());
		System.out.println("getName of visitedCities: " + visitedCities.getClass().getName() + "\n");
		System.out.println("Some statistics: ");
		System.out.println("Number of visited cities: " + visitedCities.size());
		System.out.println("Visited cities (as string): " + String.join(", ", visitedCities) + "\n");
		
		
		// Create new data-structure to store unvisited-cities 
		Set<String> unvisitedCities = new TreeSet<>(allCities);	
		unvisitedCities.removeAll(visitedCities);
		System.out.println("Unvisited cities: " + unvisitedCities);
		
	}
	
}





















