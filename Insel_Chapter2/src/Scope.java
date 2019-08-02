/**
 * Example - Scope:
 * scope of variables		
 * page 216
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */


public class Scope {
	
	public static void main(String[] args ) {
		int foo = 0;
		
		{
			int bar = 0;					// gilt nur in diesem Block
			System.out.println( bar );
			System.out.println( foo );
		}
		
		System.out.println( foo );
		// System.out.println( bar );			// error: can not be resovled to variable
	}
	
	static void qux() {
		int foo, baz;						// anderes foo und bar als oben
		
		{
			//int baz; 						// duplicate error
		}
	}

}
