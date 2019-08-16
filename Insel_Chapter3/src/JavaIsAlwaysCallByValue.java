/**
 * Example - Java does always Call-By-Value! (Python: call by object)
 * 
 *
 * @author 		Oliver Zott
 * @date 		11.08.2019
 * @version		1.0
 */


import java.awt.Point;

public class JavaIsAlwaysCallByValue {
	
	static void clear( Point p ) {
		System.out.println( p );
		p = new Point();				// doesn't overwrite parameter variable from function call / new object reference created instead
		System.out.println( p );		// prints new reference variable (other than main-variable p)
	}
	
	static void clear2 ( final Point p ) {	// overcome problem with explicit Attribute change!
		System.out.println();
		System.out.println( p );
		p.x = p.y = 0;					// now overwritten!
		System.out.println( p );
	}
	
	static void clear3 ( final Point p ) {		// so that Parameter variable CAN NOT be assigned new
		System.out.println();
		System.out.println( p );
		p = new Point();
	}
	
	public static void main( String[] args) {
		Point k = new Point( 10, 20 );
		clear( k );
		System.out.println( k );
		
		clear2 ( k );
		System.out.println( k );
		
		clear3( k );
		System.out.println( k );
	}

}
