package Chapter7_2;

public class Playground2 {

	public static void main( String[] args ) {
		
		Player Olli = new Player("ollgu");
		Player Leni = new Player("lengu");
		Player Sigi = new Player("Siigig");
		
		Room Nest = new Room();
		Nest.size = 24;
		Nest.setName("Zwugunest");
		
		System.out.println(Olli.getName());
		System.out.println(Nest.getName() + Nest.size);
		
		
	}
}
