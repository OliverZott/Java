package chapter7_7_interfaces;

public class PriceUtils {
	
	static double calculateSum(Buyable first, Buyable... more) {
		/**
		 * method which sums up prices of buyable objects
		 * -> doesn't care what sort of object
		 * -> object just needs to implement 'Byuable' interface
		 */
		double result = first.price();
		
		for (Buyable buyable : more) {
			result += buyable.price();
		}
		
		return result;
	}

}
