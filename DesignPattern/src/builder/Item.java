/**
 * Create an interface Item representing food item and packing.
 * 
 * interface --> class (implement all methods ...)
 * interface --> abstract class (not an implementation, so no need to implement abstract interface stuff)
 * https://stackoverflow.com/questions/8026580/an-abstract-class-in-java-need-not-implement-any-methods-from-its-implementing-i
 * 
 * interface vs. abstract
 * https://javapapers.com/core-java/abstract-and-interface-core-java-2/difference-between-a-java-interface-and-a-java-abstract-class/
 * 
 * interface
 * all field final --> initialize!
 * 
 * 
 * source: https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 * 
 */

package builder;

public interface Item {
	
	public String name();
	public Packing packing();
	public float price();
	
}
