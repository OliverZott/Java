/**
 * Example - DrawPlayerAndZnake:
 * page 262
 * 
 * -	methods with reference-types as parameter
 * -	in static method initializeToken exist 2 names of  point obj: p / PlayerPosition (just in VM)
 * - 	Main only knows PlayerPosition
 * 
 * 
 * @author:		Oliver Zott
 * @date: 		11.08.2019
 * @version:	1.0
 */


package point;
import java.awt.Point;



public class DrawPlayerAndZnake {									// Class declaration
	
	static void initializeToken ( Point p ) {						// Method declaration
		int randomX = (int)(Math.random() * 40); 					// 0 <= x < 40  convert float to int
		int randomY = (int)(Math.random() * 10); 					// 0 <= y < 10	
		p.setLocation(randomX, randomY);
				
	}
	
	static void printScreen ( Point playerPosition,					// Method declaration
							  Point snakePosition ) {
		for ( int y = 0; y < 10; y++ ) {
			for ( int x = 0; x < 40; x++ ) {
				if ( playerPosition.distance( x, y ) == 0 ) {
					System.out.print("P");
				}
				else if ( snakePosition.distance(x, y) == 0 ) {
					System.out.print("S");
				}
				else System.out.print(".");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {						// Main 
		
		Point playerPosition = new Point();
		Point snakePosition = new Point();
		System.out.println ( "Player Position: " + playerPosition);
		System.out.println ( "Snake Position: " + snakePosition);
		System.out.println();
		
		initializeToken ( playerPosition );
		initializeToken ( snakePosition );
		System.out.println ( "Player Position initialized: " + playerPosition);
		System.out.println ( "Snake Position initialized: " + snakePosition);
		System.out.println ();
		
		printScreen ( playerPosition, snakePosition );

	}

}
