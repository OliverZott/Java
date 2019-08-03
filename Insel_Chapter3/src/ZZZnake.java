/**
 * Example - ZZZnake:
 * page 246
 * 
 * -	java.awt.Point
 * -	new
 * -	switch
 * -	if-else
 * -	boolean
 * 
 * 
 * @author:		Oliver Zott
 * @date: 		03.08.2019
 * @version:	1.0
 */


public class ZZZnake {
	
	public static void main ( String[] args ) {
		
		// Definition
		java.awt.Point playerPosition = new java.awt.Point( 10, 9 );
		java.awt.Point snakePosition = new java.awt.Point( 30, 2 );
		java.awt.Point goldPosition = new java.awt.Point( 6, 6 );
		java.awt.Point doorPosition = new java.awt.Point( 0, 5 );
		
		boolean rich = false;
		
		while( true ) {
			// Raster mit Figuren zeichnen
			
			for ( int y = 0; y < 10; y++ ) {
				for ( int x = 0; x < 40; x++ ) {
					
					// Punktvariable, die durchlaufen wird
					java.awt.Point p = new java.awt.Point( x, y );
					
					if (playerPosition.equals(p)) 
						System.out.print( 'P' );
					else if (snakePosition.equals(p))
						System.out.print('Z');
					else if (goldPosition.equals(p))
						System.out.print('$');
					else if (doorPosition.equals(p))
						System.out.print( 'D' );
					else System.out.print( '.' );
				}
				System.out.println();
			}
				
				// Status feststellen
				if ( rich && playerPosition.equals( doorPosition)) {
					System.out.println( "Gewonnen" );
					return;
				}
				if ( playerPosition.equals( goldPosition)) {
					rich = true;
					goldPosition.setLocation(-1, -1);
				}
				if ( playerPosition.equals( snakePosition)) {
					System.out.println( "ZZZZZZZ. Die Schlange hat dich" );
					return;
				}
				
				// Konsoleneingabe und Spielerposiotion veraendern
				
				switch( new java.util.Scanner( System.in ).next() ) {
				case "w" : playerPosition.y = Math.max( 0,  playerPosition.y -1 ); break;
				case "s" : playerPosition.y = Math.min( 9, playerPosition.y + 1 ); break;
				case "a" : playerPosition.x = Math.max( 0, playerPosition.x -1); break;
				case "d" : playerPosition.x = Math.min( 39, playerPosition.x +1); break;
				}
				
				// Schlange bewegt sich richtung spieler
				if ( playerPosition.x < snakePosition.x )
					snakePosition.x--;
				else if ( playerPosition.x > snakePosition.x )
					snakePosition.x++;
				else if ( playerPosition.y < snakePosition.y )
					snakePosition.y--;
				else if ( playerPosition.y > snakePosition.y )
					snakePosition.y++;
		} // end while
	}
}
