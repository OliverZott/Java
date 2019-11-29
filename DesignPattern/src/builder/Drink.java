package builder;

/**
 * abstract class providing basic functionality
 * 
 * @author Oliver Zott
 */


public abstract class Drink implements Item {
	
	
	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	
	@Override
	public abstract float price();
	

}
