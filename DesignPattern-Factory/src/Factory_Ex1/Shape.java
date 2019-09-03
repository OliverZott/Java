/**
 * Factory Pattern
 * 
 * source: 	https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 * 
 * @author Oliver Zott
 * @version 1.0 / 03.09.2019
 */


/*
 * Interface vs. Class vs. Abstract Class
 * 
 * Java interface = C++ abstract class
 * An interface is just like Java Class, but it only has static constants and abstract method. 
 * Java uses Interface to implement multiple inheritance. 
 * A Java class can implement multiple Java Interfaces. 
 * All methods in an interface are implicitly public and abstract
 * only class that implements interface can implement the method!
 * 
 * https://www.guru99.com/java-interface.html
 * https://www.tutorialspoint.com/java/java_interfaces.htm
 * https://stackoverflow.com/questions/10839131/implements-vs-extends-when-to-use-whats-the-difference
 * https://stackoverflow.com/questions/34520985/why-no-override-decorator-in-python-to-help-code-readability
 * 
 */


package Factory_Ex1;

public interface Shape {
	
	void draw();

}
