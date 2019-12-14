package chapter17_1_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Chapter 17.1
 * List Example - Methods (page 982-983)
 * 
 * @author Oliver Zott
 * @version 1.0 (2019.12.02)
 */

public class Ex17_2_ListMethods {
	
	public static void main(String[] args) {
		
		/**
		 * List: create / add / set
		 * 
		 * - add
		 * - addAll
		 * - set
		 * - Arrays.asList
		 */
		List<String> list1 = new ArrayList<>();
		list1.add("Eva");
		list1.add(0, "Charisma");  // position in list specified
		list1.add("Pallas");
		
		// page 991 "Arrays.asList(array)"
		// bridge between array-based and collection-based APIs
		List<String> list2 = Arrays.asList("Tina", "Wilhelmine");  
		list1.addAll(2, list2);
		// list2.add("XXX");  // not working  ?!?!?
		list1.add("XXX");
		System.out.println("list1[5]: " + list1.get(5));
		list1.set(5,  "Eva");
		
		System.out.println("list1: " + list1);
		System.out.println("Size of list1: " + list1.size() + "\n");
		
		
		/**
		 * List: position-request / search
		 * 
		 * - contains
		 * - containsAll
		 * - get
		 * - indexOf
		 * - Arrays.asList
		 */
		System.out.println(list1.contains("Tina"));
		System.out.println(list1.containsAll(Arrays.asList("Tina", "Pallas")));  // without "asList" only array!
		System.out.println(list2.get(0));
		System.out.println(list2.indexOf("Wilhelmine"));
		System.out.println(list2.lastIndexOf("Wilhelmine"));
		System.out.println(list2.isEmpty() + "\n");
		
		
		/**
		 * List: list to array / new lists
		 * derive arrays from lists
		 * 
		 * - toArray  ... convert collection to array
		 * - LinkedList
		 * - retainAll  ... creates intersection
		 */
		String[] array = list1.toArray(new String[list1.size()]);
		// alternative with Method-Reference (page 810)
		// String[] array = list1.toArray(String[]::new); 
		System.out.println(array[0]);
		
		List<String> list3 = new LinkedList<String>(list1);
		System.out.println(list3);
		
		list3.retainAll(Arrays.asList("Eva", "Tina"));
		System.out.println(list3 + "\n");	
		
		/**
		 * List: delete elements
		 * 
		 * - remove
		 * - removeAll
		 * - clear
		 */
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);
		list1.remove("Pallas");
		System.out.println(list1);
		list1.removeAll(Arrays.asList("Eva", "Tina"));
		System.out.println(list1);
		list1.clear();
		System.out.println(list1);
		}
}
