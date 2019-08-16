/**
 * Example - Print The Average
 * 
 * - Array declaration, initiation, filling
 * 
 * @author Oliver Zott
 * @version 1.0
 * @date 12.08.2019
 */


public class PrintTheAverage {
	
	public static void main( String[] args) {
		double[] numbers = { 1.9, 7.8, 2.4, 9.3};
		int[] test_arr = new int[10];
		double sum = 0;
		
		for ( int i = 0; i < numbers.length; i++) {
			sum += numbers[ i ];
		}
		
		double avg = sum / numbers.length;
		
		System.out.println("Length of double Array 'numbers': " + numbers.length);
		System.out.println("Average of double Array 'numbers': " + avg );
		System.out.println("Length of test_arr: " + test_arr.length);		// showing legth of array, no matter if used!
		
	}
}