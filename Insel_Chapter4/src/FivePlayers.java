/**
 * Arrays of Point-Class objects
 * page 282
 * 
 * @author Oliver Zott
 */

import java.awt.Point; 
import java.lang.Math;
import java.util.Arrays;


public class FivePlayers {
	
	public static void main( String[] args ) {
		
		Point[] players = new Point[5];
		
		
		// initializing doesn't work with array-for-loop!
		for ( int i = 0; i < players.length; i++ ) {
			players[ i ] = new Point( (int)(Math.random()*40), (int)(Math.random()*10));
		}
		
		/* testing:
		for (Point p: players) {
			System.out.println(p);	
		}
		*/
		
		// print location:
		for ( int i = 0; i <= 10; i++ ) {
			for ( int j = 0; j <= 40; j++) {
				if ( Arrays.asList( players ).contains( new Point (j, i) ) ) {
					System.out.print("&");
				}
				else 
					System.out.print(".");
			}
			System.out.println();
		}
		
	}
}