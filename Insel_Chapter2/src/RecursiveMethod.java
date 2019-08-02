/**
 * Example - RecursiveMethod:
 * Recursive method / endless recursion 
 * page 219
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */


public class RecursiveMethod {
	
	static void down( int n ) {
		if (n<=0) {
			return;
		}
		System.out.print( n + ", " );
		down( n-1 );
	}
	
	public static void main(String[] args) {
		
		down(15);
	}
}