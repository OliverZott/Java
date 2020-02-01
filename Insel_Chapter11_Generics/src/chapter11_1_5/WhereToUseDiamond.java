/**
 * Chapter 11.1.5 - Usage of Diamond Operator
 * (source: 'insel' page 735)
 * 
 * Example of how to use the diamond operator to abbreviate code.
 * Several fields of application.
 * 
 * - List<>			...interface
 * - ArrayList<> 	...class implementing interface List
 * 	
 * https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * 
 * @author Oliver Zott
 * date: 2020-02-01
 */

package chapter11_1_5;

import java.util.ArrayList;
import java.util.List;


public class WhereToUseDiamond {
	
	// Diamond Operator usage for the return value
	public static List<String> foo(List<String> list) {
		return new ArrayList<>();
	}
	
	public static void showList(List<String> list) {
		for(String i: list) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		// usage for declaration and initialization
		List<String> list1 = new ArrayList<>();
		list1.add("Element1");
		list1.add("Element2");
		
		// usage for initialization
		List<String> list2;
		list2 = new ArrayList<>();
		list2.add("Element3");
		list2.add("Element4");
		
		list1.addAll(list2);

		// usage as method-argument
		System.out.println(foo(new ArrayList<>(list2)));
		showList(list1);
		
	}

	
}
