/**
 * Example - FriendlyGreeter:
 * Input / Float example
 * 
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */


public class FriendlyGreeter {						// class declaration

	// void greet() {								// static cause not object.methode
	static void greet() {							// Method declaration / () no Parameter /  void - no return value
		System.out.println("Hallo Zwugu :P");
	}
	
	static void sqrtprint(double d) {
		if (d < 0) {
			System.out.println("Keine Negativen Wurzeln!");
			return;
		}
		System.out.println("Das Quadrat lautet: " + d*d);
	}
	
	static double  largeRandom() {					// if wrong type (int instead double) --> with STRG+1 Java correction
		return Math.random() * 100;
	}
	
	static String posOrNeg (double d) {
		if (d >= 0) {
			return "pos";
		}
		if (d < 0) {
			return "neg";
		}
		else return "error";						// WICHTIG!!!! Sonst kein Rückgabewert!!! Muss EINDEUTIG sein!!!   S.212
	}
	
	static boolean between (int a, int x,int b) {
		return a <= x && x <= b;
	}
	
	
	public static void main(String[] args) {
		greet();
		sqrtprint(-2);
		sqrtprint(7);
		double a = largeRandom();
		System.out.println(a);
		String s = posOrNeg(-4);
		System.out.println(s);
		System.out.println(between(-2, 23, 24));
	}
													// Aufruf in anderer Klasse -> siehe Conversation.java:  FriendlyGreeter.greet();
}
