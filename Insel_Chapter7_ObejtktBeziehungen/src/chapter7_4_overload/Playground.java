/**
 * Chapter 7.4 - overload
 * 
 * - toString()  @Override
 * - String.format() 
 * - final
 * 
 * 
 * @author Oliver Zott
 */

package chapter7_4_overload;


public class Playground {
	
	public static void main(String[] args) {
		GameObject go1 = new GameObject();
		Room Enterprise = new Room();
		ControlObject co1 = new ControlObject();
		
		
		go1.name = "Objekt Nummer 1";
		Enterprise.name = "Enterprise";
		Enterprise.size = 725;
		co1.name = "control object";
		
		System.out.println(go1);
		System.out.println(Enterprise);
		
		System.out.println(co1);	// standard return is "toString": getClass().getName() @ ...
		System.out.println(co1.getClass());
		System.out.println(co1.getClass().getName());
		
		System.out.println();
		System.out.println("Example: covariance return values: ");
		System.out.println(Enterprise.getThis());
		System.out.println(go1.getThis());
		
		
	}

}
