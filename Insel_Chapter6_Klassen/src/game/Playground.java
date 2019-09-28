/**
 * Example 1: Class Declaration - OOP - style
 */

package game;

//import game.Player;

public class Playground {
	
	public static void main( String[] args ) {
		
		Player p = new Player();
		p.name = "Zwugu";
		// p.item = "Killer Pony";
		
		// System.out.printf("%s ist mit einem %s unterwegs. Jeeeeyyyy  :) \n", p.name, p.item);
		// System.out.println(null == (new Player().name )); // runtime will initialize with standard values ( null for refvars)
		
		// 
		
		System.out.printf("Spieler %s hat: %s \n",  p.name,  p.item);
		p.carry("Regenbogen-Jacke");	// Good Smell: method is set directly to object
		System.out.printf("Spieler %s hat: %s \n",  p.name,  p.item);
		p.carry("Killer Pony");
		System.out.printf("Spieler %s hat: %s \n",  p.name,  p.item);

		System.out.println(p.doesCarry("Regenbogen-Jacke"));
		System.out.println(p.doesCarry("Pupse-Pony"));
		System.out.println();
		
		// -----------------------------------------------------
		// Setter Example
		
		Player p2 = new Player();
		p2.setPlayer("Van Hellsing", "Pfahl");
		System.out.printf("Name von Player 2 is '%s' \n", p2.name);
		System.out.println("'Get-function' for player object: " + p2.getPlayerObject());
		p2.getPlayer();
	}

}
