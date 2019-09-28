/**
 * Example 2: Class Declaration - Procedural - style
 */

package game;

public class ProceduralExample1 {

	
	public static void main ( String[] args ) {
		
		PlayerData Olli = new PlayerData();
		Olli.name = "Olli";
		
		PlayerFunctions.carry(Olli, "Penis");		// Bad Smell: external method given to object
		
		System.out.println(Olli.name);
		System.out.println(Olli.item);
		
	
	}
	
}
