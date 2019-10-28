package constructor;


public class Player {
	
	public String item;
	public String name;
	public String zwu;
	
	/* Constructors for Player-class */
	public Player() { }
	
	public Player( String name, String item ) {		// overwritten constructor
		this.name = name;
		this.item = item;
	}
	
	public Player( Player player ) {	// copy constructor
		name = player.name.trim();
		item = player.item.trim();
	}
	
	
	public static void main( String[] args ) {
		
		Player Lena = new Player();
		Lena.name = "Lena";
		
		Player Olli = new Player( "  Olli Zott ", " Killer Pony " );
		
		Player Sigi = new Player( Olli ); 		
		
		System.out.println("Lena: " + Lena.name);
		System.out.println("Olli name: " + Olli.name);
		System.out.println("Olli item: " + Olli.item);
		System.out.println("Sigi name: " + Sigi.name);
		System.out.println("Sigi item: " + Sigi.item);
		
	}
	

}
