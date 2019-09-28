/**
 * Example 1: Class Declaration - OOP - style
 * page 398
 * 
 * - OOP Version: Player Class has Data & Method
 * 
 * @author Oliver Zott
 */

package game;

public class Player {
	
	String name = "";	// "" to avoid "null" if not instantiated 
	String item = "";
	
	void setPlayer( String nam, String it ) {
		this.name = nam;
		this.item = it;
	}
	
	void getPlayer() {
		System.out.printf("Player '%s' hat das Item '%s'. \n", this.name, this.item);
	}
	
	Player getPlayerObject() {
		return this;
	}
	
	void carry( String newItem ) {		// NOT static... calls object-variable (its an object-method)
		if ( newItem != null && newItem.length() != 0 ) {
			item += newItem + ";";  	// "item" is a 'nonstatic field' --> so method not static!
		}
	}
		
	boolean doesCarry( String anItem ) {
		if ( anItem == null )
			return false;
		return ( ";" + item).contains( ";" + anItem + ";" );
	}

}
