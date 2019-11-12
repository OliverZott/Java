/**
 * 
 * http://www.codeadventurer.de/?p=3027
 * 
 * @author Oliver Zott
 * @date 04.11.2019
 */


package Chapter7_2;

public class GameObject {
	
	// Attribute
	private String name;
	
	// Setter-Getter
	public void setName( String name ) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// Constructor (NEVER call methods that can be overridden - only private/finals)
	public GameObject() {
		
	}
	public GameObject( String name) {
		System.out.println("Constructor-Superclass");
		this.name = name;		
	}

}
