/** Example: Composite - Pattern
 * 
 * 
 * source: https://www.philipphauer.de/study/se/design-pattern/composite.php
 * 
 * HINTS: 
 * https://javahungry.blogspot.com/2015/03/difference-between-array-and-arraylist-in-java-example.html
 * 
 * @Author Oliver Zott
 * @Date 25.10.2019
 */


package Composite_test;


public abstract class Mitarbeiter {
	
	private String name;
	private int telefonNumber;
	
	
	/* Constructor */
	public Mitarbeiter ( String name, int telefonNumber) {
		this.name = name;
		this.telefonNumber = telefonNumber;
	}
	
	
	/* Setter, Getter Methods */
	public void setName( String name ) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setTelefon( int tele ) {
		this.telefonNumber = tele;
	}
	public int getTelefon() {
		return telefonNumber;
	}
		

}
