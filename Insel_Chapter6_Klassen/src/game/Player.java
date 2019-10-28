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
	
	private String name = "";	// "" to avoid "null" if not instantiated 
	private String item = "";
	
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
	
	
	/* Constructor */
	
	public Player () { }	// Constructor without parameters
	
	public Player ( Player player ) { 	// Copy-Constructor
		name = player.name;
		item = player.item;
	}
	
	
	/* ---------------------------------------------------------------------------------
	 * alternative Setter / Getter methods (like in the book p.414)
	 */
	
	public String getName() {
		return this.name;
	}
	
	public void setName( String name ) {
		if ( name != null && !name.trim().isEmpty() ) {
			this.name = name;
		}
	}
	
	public String getItem() {
		return item;  // 'this' not necessary
	}
	
	public void setItem( String item ) {
		if (name != null && !name.trim().isEmpty() ) {
			this.item = item;
		}
	}

	
	void carry( String newItem ) {		// NOT static... calls object-variable (its an object-method)
		if ( newItem != null && newItem.length() != 0 ) {
			item += newItem + ";";  	// "item" is a 'nonstatic field' --> so method not static!
		}
	}
		
	boolean doesCarry( String anItem ) {
		if ( anItem == null )
			return false;
		return ( ";" + this.item).contains( ";" + anItem + ";" );
	}

}
