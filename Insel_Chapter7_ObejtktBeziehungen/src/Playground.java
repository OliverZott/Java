
public class Playground {
	
	
	public static void main( String[] args ) {
		
		Player Olli = new Player( "Olli" );
		Player Leni = new Player( "Leni" );
		Room tower = new Room();
		
		Olli.room = tower;
		tower.addPlayer(Olli);
		tower.addPlayer(Leni);
		
		System.out.println(Olli.room);
		tower.listPlayers();
		System.out.println(Olli.getName());
		
		// tower.player = null;
	}

}
