/**
 * HashSet - Example
 * https://www.callicoder.com/java-hashset/
 *
 * ArrayList  VS   HashSet
 * https://www.geeksforgeeks.org/difference-between-arraylist-and-hashset-in-java/
 * 
 * @author zott.oliver
 *
 */

package diffListSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class Ex_HashSet {
	
	public static void main(String[] args) {
		
		
		// Creating HashSet
		Set<String> daysOfWeek = new HashSet<>();   // converting from hashset to set 
		
		
		// Adding elements to set
		daysOfWeek.add("monday");
		daysOfWeek.add("tuesday");
		daysOfWeek.add("wednesay");
		daysOfWeek.add("thursday");
		daysOfWeek.add("friday");
		daysOfWeek.add("saturday");
		daysOfWeek.add("sunday");
		
		
		// Adding duplicate
		daysOfWeek.add("wednesay");

		
		/* print HashSet (Iterator)
		 * 
		 * https://stackoverflow.com/questions/12455737/how-to-iterate-over-a-set-hashset-without-an-iterator
		 * https://javabeginners.de/Sammlungen_und_Listen/Iterator.php
		 */ 
		//System.out.printl(daysOfWeek);  // wont work 
		Iterator <String> daysOfWeekIter = daysOfWeek.iterator();
		while(daysOfWeekIter.hasNext()) {
			System.out.println(daysOfWeekIter.next());
		}
		System.out.println();
		
		
		// print HashSet (Function operator / lambda)
		daysOfWeek.forEach((s) -> System.out.println(s));
		
		
		/* =============================================================================================================		
		 * HashSet from other Collection  		
		 * 
		 * - Arrays.asList   ... to declare directly
		 * 
		 */
		List<Integer> divisibleBy5 = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));
		List<Integer> divisibleBy3 = new ArrayList<>();
		
		divisibleBy3.add(3);
		divisibleBy3.add(6);
		divisibleBy3.add(9);
		divisibleBy3.add(12);
		
		Set<Integer> divisibleBy5or3 = new HashSet<>(divisibleBy3);
		
		divisibleBy5or3.addAll(divisibleBy5);	// addAll to add COLLECTION!
		
		divisibleBy5or3.forEach((s) -> System.out.println(s));
		
		
		
		
	}

}
