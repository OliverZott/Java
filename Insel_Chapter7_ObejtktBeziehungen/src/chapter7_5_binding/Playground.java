package chapter7_5_binding;

/**
 * Chapter 7 - dynamic binding (polymorphie?)
 * 
 * - toString() returns string representation of any object
 * 
 * - https://stackoverflow.com/questions/19017258/static-vs-dynamic-binding-in-java
 * 
 * @author Oliver Zott
 *
 */

public class Playground {
	
	public static void main (String[] args) {
		
		
		// runtime-environment uses object-type (rhs), not reference-type
		Room rr = new Room();
		rr.name = "rr";
		rr.size = 9999;
		System.out.println(rr.toString());

		GameObject rg = new Room();
		rg.name = "rg";
		System.out.println(rg.toString());
		
		Object ro = new Room();
		System.out.println(ro.toString());
		
		
		GameObject rr2 = new GameObject();
		System.out.println(rr2.toString());
	}
}
