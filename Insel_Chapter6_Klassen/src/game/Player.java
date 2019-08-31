/**
 * Example: game
 * page 398
 * 
 * @author Oliver Zott
 */

package game;

public class Player {
	
	String name;
	String item;
	
	void carry( String newItem ) {
		if ( newItem != null && newItem.length() != 0 ) {
			item += newItem + ";";
		}
	}
		
	boolean doesCarry( String anItem ) {
		if ( anItem == null )
			return false;
		return ( ";" + item).contains( ";" + anItem + ";" );
	}

}
