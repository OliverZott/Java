import java.util.ArrayList;


public class Room {
	
	// Array and generic
	private ArrayList<Player> players = new ArrayList<Player>();
	
	
	// Method
	public void addPlayer( Player player ) {
		players.add( player );
	}

	public void listPlayers() {
		for ( Player p : players) {
			System.out.println("Player: " + p.getName());
		}
	}
	
}	
