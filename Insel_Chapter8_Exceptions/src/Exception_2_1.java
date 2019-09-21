/**
 * Exception Handling: Example 2.1
 * 
 * - UNCHECKED Exceptions (Runtime)
 * 
 * source: https://beginnersbook.com/2013/04/java-checked-unchecked-exceptions-with-examples/
 * 
 * @author Oliver Zott
 * @version 1.1 / 09.09.219
 */

public class Exception_2_1 {
	
	
	public static void main( String[] args ) {
		
		int num1 = 10;
		int num2 = 0;
		
		
		try {
			int[] array = {1,2,3,4,5};
			
			// Index out of Bound Exception!
			System.out.println(array[7]);
		} catch ( ArrayIndexOutOfBoundsException e ) {
			System.out.printf( "Arry Index out of bound. Error %s. %n", e);
			System.out.println();
		}
		
		
		try {
			// Division by zero -> unchecked Arithmetic exception!
			int res = num1 / num2;
			System.out.println(res);
		} catch( ArithmeticException ae) {
			System.out.println( "Error, Arrithmetic blabla: " + ae);
		}
	
	}

}
