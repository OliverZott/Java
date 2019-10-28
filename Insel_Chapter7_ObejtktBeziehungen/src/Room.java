import java.util.ArrayList;


public class Room {
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public void addPlayer( Player player ) {
		players.add( player );
	}

	public void listPlayers() {
		for ( Player p : players) {
			System.out.println("Player: " + p.getName());
		}
	}
	
}	
