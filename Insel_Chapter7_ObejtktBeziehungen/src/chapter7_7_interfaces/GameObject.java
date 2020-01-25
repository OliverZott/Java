/**
 * Chapter 7.6 - Abstract methods
 * (page 505)
 * 
 * 
 * @author Oliver Zott
 */

package chapter7_7_interfaces;

public abstract class GameObject implements Buyable {
	
	double price;
	
	@Override
	public double price() {
		return price;
	}

}
