/**
 * Variable argument-count as parameters
 * VAriable return values
 * (page 283 / 292)
 * 
 * @author olli
 *
 */

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
	
	
	// method called with variable arguments
	// two return values
	static double[] avg_varargs( double... array ) {
		double sum = 0;
		for ( double i: array ) {
			sum += i;
		}
		return new double[]{sum, sum / array.length};
	}
	
	
	public static void main( String[] args ) {
		
		double[] arr = {1,23.7, 11, 13.55233};
		double[] arr2 = new double[] {1,2,3,};  // aternative schreibweise
		System.out.println( "avg(array): " + avg(arr));
		// System.out.println( "avg(2, 11.3, 17, 536): " + avg(2, 11.3, 17, 536));  // java.lang.Error: Unresolved compilation problem:
		System.out.println( "Sum: " + avg_varargs(2, 11.3, 17, 536)[0] + ", Average:" + avg_varargs(2, 11.3, 17, 536)[1]);
		
	}
	

}
