/**
 * Example - Print The Average
 * 
 * page 274 / 277
 * 
 * - Array declaration, initiation, filling
 * - Array as method-parameter
 * 
 * @author Oliver Zott
 * @version 1.0
 * @date 12.08.2019
 */


public class PrintTheAverage {
	
	// array as method-parameter
	static double avg1( double[] arr1 ) {
		
		double sum1 = 0;
		
		for ( int i = 0; i < arr1.length; i++) {
			sum1 += arr1[ i ];
		}
		
		return sum1 / arr1.length;
	}
	
	
	// some array testing
	public static void main( String[] args) {
		
		double[] numbers = { 1.9, 7.8, 2.4, 9.3};
		int[] test_arr = new int[10];
		double sum = 0;
		int[] primes = {2, 3, 5, 7, 11, 13 };
		
		// calculating average of array
		for ( int i = 0; i < numbers.length; i++) {
			sum += numbers[ i ];
		}
		
		// showing all elements of array:
		for( int i = 0; i <= primes.length-1; i++) {
			System.out.println( "Primes are: " + primes[i]);
		}
		
		
		double avg = sum / numbers.length;
		
		System.out.println();
		System.out.println("Length of double Array 'numbers': " + numbers.length);
		System.out.println("Average of double Array 'numbers': " + avg );
		System.out.println("Length of test_arr: " + test_arr.length);		// showing legth of array, no matter if used!
		System.out.println("3rd Element of Array: " + test_arr[3]);
		System.out.println("3rd Element of test_array: " + test_arr[3]);
		System.out.println("3rd Element of numbers_array: " + numbers[3]);
		
		System.out.println();
		System.out.println( "Array as method-parameter (avg1): " + avg1(numbers));
		
		// Anonymous array:
		System.out.println();
		System.out.println( "Anonymous Array as method-parameter (avg1): " + avg1( new double[]{1,2.3,47,23.2} ));
		
	}
}