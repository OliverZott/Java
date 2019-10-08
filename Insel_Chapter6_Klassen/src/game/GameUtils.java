/**
 * Static Methods / Static Variables
 * (page 421)
 * 
 * Oliver Zott
 */


package game;

public class GameUtils {
	
	public static final int MAX_ID_LEN = 20; // chars   .... final = constant!
	
	public static boolean isGameIdentifier( String name ) {		// static method called via classname.functionname 
		if ( name  == null )
			return false;
		
		return name.length() <= MAX_ID_LEN && name.matches("\\w+");		// regex check 
	}

}
