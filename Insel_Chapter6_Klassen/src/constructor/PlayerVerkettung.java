package constructor;

public class PlayerVerkettung {
	
	public String name;
	public String item;
	public final String base = "Zwugunest";

	
	public PlayerVerkettung() {
		this("", "");
	}
	
	public PlayerVerkettung( PlayerVerkettung player ) {
		this( player.name, player.item);
	}
	
	public PlayerVerkettung( String name, String item ) {
		this.name = name.trim();
		this.item = item.trim();
	}
	
	
	public static void main(String[] args ) {
		
		PlayerVerkettung p1 = new PlayerVerkettung();
		PlayerVerkettung p2 = new PlayerVerkettung(" Ollgu Zwuuu ", " Killer Pony ");
		PlayerVerkettung p3 = new PlayerVerkettung( p2 );
		PlayerVerkettung p4 = new PlayerVerkettung(" Lengu Zwuuu ", " Sigi ");
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p3.base);
		System.out.println(p4.name);
		System.out.println(p4.base);
		
	}
} 
