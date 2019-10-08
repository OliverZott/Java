/**
 * Example: Object-Attributes vs. Static-Attributes
 * 
 * - Static / this
 * 
 * @author Oliver Zott
 * 03.10.2019
 */

package static_attributes;

public class InStaticNoThis {
	
	String name;
	static String attribute1;
	
	static void setName() {
		// name = "Ollbert";  		// error: static ref to NON-static field
		// this.name = "Ollbert";  	// error: static = no class-object BUT this is object-specific
	}
	
	void setAttribute1() {
		this.attribute1 = "attr1";	// Object-Method CAN call every static method
	}

}
