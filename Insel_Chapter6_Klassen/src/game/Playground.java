/**
 * Example 1: Class Declaration - OOP - style
 */

package game;

//import game.Player;

public class Playground {
	
	public static void main( String[] args ) {
		
		Player p = new Player();
		// p.name = "Zwugu"; 	// possible if not private!
		p.setName("Zwugu");
		p.setItem("Killer Pony");
		
		// System.out.printf("%s ist mit einem %s unterwegs. Jeeeeyyyy  :) \n", p.name, p.item);
		// System.out.println(null == (new Player().name )); // runtime will initialize with standard values ( null for refvars)
		// System.out.printf("Spieler %s hat: %s \n",  p.name,  p.item);	// doesnt work cause private
		
		p.getPlayer();
		p.carry("Regenbogen-Jacke");	// Good Smell: method is set directly to object
		p.getPlayer();
		p.carry("Killer Pony");
		p.getPlayer();

		System.out.println(p.doesCarry("Regenbogen-Jacke"));  // why false??
		System.out.println(p.doesCarry("Killer Pony"));
		System.out.println();
		
		
		// -----------------------------------------------------
		// Setter Example
		
		Player p2 = new Player();
		p2.setPlayer("Van Hellsing", "Pfahl");
		// System.out.printf("Name von Player 2 is '%s' \n", p2.name);	// not possible cause private
		System.out.println("'Get-function' for player object: " + p2.getPlayerObject());
		p2.getPlayer();
		
		
		// -----------------------------------------------------
		// Static Example (GameUtils.java)
		
		System.out.println("test if 'KilllerPony' works: " +   GameUtils.isGameIdentifier("KilllerPony"));
		System.out.println("test if 'K!lllerPony' works: " +   GameUtils.isGameIdentifier("K!lllerPony"));
		
		
		
	}

}
