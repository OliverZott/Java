package constructor;


public class Dungeon {

	Dungeon() {
		System.out.println("2. Konstruktor.");
	}
	
	void play() {
		System.out.println("4. Spielen.");
	}
	
	
	
	public static void main( String [] args ) {
		
		System.out.println("1. Vor dem Konstruktor.");
		Dungeon d1 = new Dungeon();
		System.out.println("3. Nach dem Konstruktor.");
		d1.play();
	}
}
