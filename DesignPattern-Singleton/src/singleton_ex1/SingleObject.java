/**
 * Singleton Example 1
 * 
 * - Static member: It gets memory only once because of static, it contains the instance of the Singleton class
 * - Private constructor: It will prevent to instantiate the Singleton class from outside the class
 * - Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller
 * 
 * source: https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 * 
 * Oliver Zott
 * 08.09.2019
 */


package singleton_ex1;

public class SingleObject {
	
	// Constructor; private so class can not be instantiated
	private SingleObject() {
		System.out.println( "Contructor called for SingleObject - object." );
	}
	
	// Create an object of SingleObject
	private static SingleObject instance = new SingleObject();

	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hallo Welt und so.");
	}

}
