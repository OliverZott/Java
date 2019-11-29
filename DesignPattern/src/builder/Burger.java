package builder;

/**
 * abstract class providing basic functionality
 * 
 * @author Oliver Zott
 */


public abstract class Burger implements Item {
	
	
	// not all methods have to be overridden
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	
	// interface-method / abstract
	@Override 
	public abstract float price();
	

}
