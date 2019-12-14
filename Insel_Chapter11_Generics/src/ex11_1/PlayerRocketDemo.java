/**
 * 
 * Autoboxing: 
 * 		http://javatricks.de/tricks/was-ist-autoboxing
 * Primitive vs. Object: 
 * 		https://stackoverflow.com/questions/19094442/what-is-the-difference-between-float-and-float-in-java
 * 
 */

package ex11_1;

public class PlayerRocketDemo {
	
	
	public static void main(String[] args) {

		Player zwugu = new Player();
		zwugu.name = "Lenchen";
		
		Rocket<Long> rocket = new Rocket<Long>();   // generic Version !!!
		Long aBigNumber = 11111111111111L;   // without "L"  ..out of range !!!
		rocket.set(aBigNumber);
	
		zwugu.leftRocket = rocket;
		zwugu.rightRocket = new Rocket<Float>(2.1246f);  // Float = 	
		
		System.out.println(zwugu.name + " carries in rocket: " + zwugu.leftRocket.get() + " and " + zwugu.rightRocket.get());
		
		
		/*
		 * Thanks to generic no need to change types of setter and getter !!!
		 * (page 732)
		 */
		Rocket<Integer> intRocket = new Rocket<Integer>();
		Rocket<String> stringRocket = new Rocket<String>();
		
		intRocket.set(2);
		stringRocket.set("teeestRocketStuff");
		
		int x = intRocket.get();  // no type-casting needed!
		// int x = (int) intRocket.get();  // obsolete type-casting version
		
		System.out.println(intRocket.get());
		System.out.println(x);
		
		
		/*
		 * Nested generic
		 * (page 733)
		 */
		Rocket<Rocket<String>> rocketOfRockets = new Rocket<>();
		rocketOfRockets.set( new Rocket<String>());
		rocketOfRockets.get().set("Inner Rocket<String>");  // get value, which is rocket itself now
		System.out.println(rocketOfRockets.get().get());  // returns inner generic
		
		
	
	
	
	}
	
}
