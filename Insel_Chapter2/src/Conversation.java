/**
 * Example - Conversation:
 * Input / Float example
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */


public class Conversation {
	
	public static void main( String[] args) {
		
		FriendlyGreeter.greet();							//  FriendlyGreeter.java
		
		System.out.println("Name: ");
		String name = new java.util.Scanner( System.in ).nextLine();
		System.out.printf( "Hello %s %n", name);

		//Alternative
		// String name2 = javax.swing.JOptionPane.showInputDialog( "Eingabe Ihres Spitznamen: " );
		// System.out.printf( "Hello %s %n", name2);
		
		// float example
		System.out.println(20000000000F == 20000000000F+1);
		System.out.println(20000000000D == 20000000000D+1);
		// error
		System.out.println ( 123456789012345L); // works with L but else its assumed int (out of range)
		
		System.out.println( 123456789 +54321L);
		System.out.println( 123456789 +54321);
		
	}

}
