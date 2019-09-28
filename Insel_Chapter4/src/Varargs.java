

public class Varargs {
	
	
	// standard avg-method
	static double avg( double[] array ) {
		
		if ( array == null || array.length == 0 )
			throw new IllegalArgumentException( "Error: Array null or empty!" );
		
		double sum = 0;
		
		for  ( double n: array ) {
			sum += n;
		}
		
		return sum / array.length;
	}
	
	
	// method with variable arguments
	static double avg_varargs( double... array ) {
		
		double sum = 0;
		
		for ( double i: array ) {
			sum += i;
		}
		
		return sum / array.length;
	}
	
	
	public static void main( String[] args ) {
		
		double[] arr = {1,23.7, 11, 13.55233};
		System.out.println( "avg(array): " + avg(arr));
		// System.out.println( "avg(2, 11.3, 17, 536): " + avg(2, 11.3, 17, 536));  // java.lang.Error: Unresolved compilation problem:
		System.out.println( "avg_varargs(2, 11.3, 17, 536): " + avg_varargs(2, 11.3, 17, 536));
		
	}
	

}
