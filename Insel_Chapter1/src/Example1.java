/*
 * First Example: Squares
 * 
 * Author:		Oliver Zott
 * Date:		02.08.2019
 * Version:		1.0
 */


public class Example1 {
	
	static int quadrat( int n ) {
		return n*n;
	}
	
	static void ausgabe( int n ) {
		for (int i = 1; i <= n; i = i + 1 ) {
			String s = "Quadrat von " + i + " = " + quadrat( i );
			System.out.println( s );
		}
	}
	
	public static void main( String[] args) {
		ausgabe( 4 );
		System.out.println( "test" );								// "out" is object, "println" is respective method
		System.out.println( true );
		System.out.println(-23235 );
		System.err.print("Error Ausgabe");							// erscheint irgendwo in Ausgabe?!?!?!
		System.out.print(Byte.MIN_VALUE);
	}

}
