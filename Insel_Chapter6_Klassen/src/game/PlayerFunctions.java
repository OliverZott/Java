/**
 * Example 2: Class Declaration - Procedural - style
 * 
 * - Function implementation
 * 
 */

package game;

public class PlayerFunctions {
	
	static void carry ( PlayerData data, String newItem ) {
		if ( newItem != null && !newItem.trim().isEmpty() ) {
			data.item += newItem + ";";
		}
	}
	
	

}
