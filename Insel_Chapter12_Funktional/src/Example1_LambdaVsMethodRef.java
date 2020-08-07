import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * For-Each / Lambda Expression / Method References / 
 * Links:
 *  - https://www.baeldung.com/foreach-java
 *  - https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 *  - 
 *  
 * @author Oliver Zott
 *
 */
public class Example1_LambdaVsMethodRef {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbersList = new ArrayList<>();
		numbersList.add(3);
		numbersList.add(17);
		numbersList.add(42);
		
		List<String> stringList = Arrays.asList("test", "olli", "wtf");
		// ArrayList<String> stringList = (ArrayList<String>) Arrays.asList("test", "olli", "wtf");
		
		System.out.println(numbersList);
		System.out.println(stringList);
		
		
		// For-each loop
		for(String ele : stringList) {
			System.out.println("Element on Position " + stringList.indexOf(ele) + ": " + ele);
		}
		
		// With method reference
		numbersList.forEach(System.out::println);
		
		// Lambda expression
		stringList.forEach(element -> System.out.println(element));
		
		
		/* 
		 * Stream from List (Array) Examples
		 */
		System.out.println();
		numbersList
			.stream()
			.map(n -> n*2)
			.forEach(System.out::println);
		
		System.out.println();
		Arrays.asList(13,7,9,1,5,823)
			.stream()
			.map(n -> n*2)
			.filter(n -> n % 3 != 0)
			.forEach(System.out::println);
		
	}

}
