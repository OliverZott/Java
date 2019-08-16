/**
 * Example - Import packages (java.awt.point)
 * page 230 / 239-242
 * 
 * @author:		Oliver Zott
 * @date:		10.08.2019
 * @version:	1.0
 * 
 */

package point;
import java.awt.*;

public class PointTest {

	// java.awt.Point k = new java.awt.Point();					// MUSS IN MAIN SEIN!!!
	
	//java.awt.Point q;											// Why doesn't work ???
	//q = new java.awt.Point();
 
	// System.out.println("hallo");								// Didn't call it in a method / Calling it in a class body is illegal.
	

	public static void main(String[] args) {
		
		// int q = new java.awt.Point();						// wrong type (page 237)
		java.awt.Point p = new java.awt.Point();				// has to be declared INSIDE main-method
		
		/* Example 1: */
		p.x = 1;												// .x is object-variable!	(page238)
		p.y = 2 + p.x;											// p is reference-variable to "new" object (page 237)
							
		Point a = new Point();									// works ONLY if import-class outside class!
		Point b = a;
		
		a.x = 2;
		b.y = 4;
		
		System.out.println("Position von doppel referenziertem Punkt a: " + a);		// Reference variable and object!
		System.out.println("Position von doppel referenziertem Punkt b: " + b);		// Reference variable and object!
		System.out.println("Position von doppel referenziertem Punkt p: " + p);		// Reference variable and object!
		System.out.println();		// Reference variable and object!
		
		
		/* Example 2: */
		java.awt.Point player = new java.awt.Point();
		player.x = player.y = 10;
		
		java.awt.Point door = new java.awt.Point();
		door.setLocation( 10, 100 );
		
		java.awt.Point test = new java.awt.Point();
		
		System.out.println("test Point: " + test );
		System.out.println("Location of test point: " + test.getLocation() );
		System.out.println("Length of test point: " + test.toString().length() );
		
		System.out.println ("'player.toString': " +  player.toString());				// string object to show state of object
		System.out.println ( door );													// println automatically calls "toString !
		
		String s = door.toString();														// Methode toString
		System.out.println ("door tostring: " + s );
		System.out.println ("door without tostring: " + door );
		System.out.println ( s.length() ); 
		System.out.println ( player.toString().length());
		
		// File Object !!! --> check length in bytes
		long l = new java.io.File( "test.txt" ).length();
		System.out.println ( "Dateilaenge in byte: " + l ); 							// Byte-length of text.txt file
		
		// 'equals' method
		System.out.println ( player.equals(door) );
		
		// 'distance' method
		System.out.println ( player.distance(door));

	}

}
