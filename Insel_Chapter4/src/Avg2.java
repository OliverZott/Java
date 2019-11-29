/**
 * For-Loop with arrays
 * page 279
 * 
 * @author Oliver Zott
 */


public class Avg2 {
	
	
	static double avg( double[] array ) {
		if ( array == null || array.length == 0 )
			throw new IllegalArgumentException( "Error: Array null or empty!" );
		double sum = 0;
		for  ( double n: array ) {
			sum += n;
		}
		return sum / array.length;
	}
	
	static void avg2() {
		System.out.println( "Some primes are: ");
		for ( int prime: new int[] {2, 3, 5, 7, 11, 13, 17} ) {
			System.out.println(prime);
		}
	}
	
	static void output() {
		for ( String str: new String[] {"hallo", "wtf", "supi beispiel"}) {
			System.out.print(str + ", ");
		}
	}
	
	
	public static void main( String[] args ) {
		double[] array = {17, 23.245, 23.111, 2492.3333, 11};
		System.out.println( "Average of array is: " + avg(array));
		System.out.println( "Average of array is: " + avg( new double[]{2.3,11.44431, 7.23} ));
		
		System.out.println();
		avg2();
		
		System.out.println();
		output();
		
	}
	
}
