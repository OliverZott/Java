import java.util.Arrays;

/**
 * Arrays with method-parameters
 * 
 * page 277
 * 
 * - Array as method parameter
 * - Converting array to string
 * 
 * @author Oliver Zott
 * @version 1.1 23.08.2019
 */

public class Avg1 {
	
	
	// average-function
	static double avg( double[] array) {
		double sum = 0;
		
		if ( array == null || array.length == 0 ) {
			throw new IllegalArgumentException( "Array 'null' or empty!" );
		}
		
		for (int i = 0; i <array.length; i++) {
			sum += array[ i ]; 
		}
		return sum / array.length;
	}
	
	
	// Main
	public static void main ( String[] args ) {
		double[] numbers0 = {};		// test for exception
		double[] numbers = {2, 3, 4};
		double result = avg( numbers );
		System.out.println( "The average of " + Arrays.toString(numbers) + " is " + result );
	}
}
