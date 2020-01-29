/**
 * Chapter 4.1.19 - Fill, sort, copy, compare
 * (page 296)
 * 
 * - Arrays.toString(array)
 * 
 * 
 * @author Oliver Zott
 * date: 2020-01-29
 */

import java.util.Arrays;

public class Chapter4_1_19 {
	
	public static void main(String[] args) {
		
		
		// Arrays.toString()
		String[] dogs = { "dog_abc", "dog_aa", "dog_bac", "dog_bca" };
		int[] intValues = {23, 2, 19, 235, -23};
		
		System.out.println( dogs );
		System.out.println( Arrays.toString(dogs) );
		
		
		// Arrays.sort()
		Arrays.sort(dogs);
		Arrays.sort(intValues);
		
		System.out.println( Arrays.toString(dogs) );
		System.out.println( Arrays.toString(intValues) );
		
	}
}
