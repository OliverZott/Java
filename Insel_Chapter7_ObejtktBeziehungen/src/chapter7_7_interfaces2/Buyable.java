package chapter7_7_interfaces2;

interface Buyable {
	
	int MAX_PRICE = 1_000_000;
	
	// has to be implemented by child-class using the interface!
	double price();
	
	
	// Interfaces can only implement static methods!
	// Can only be called with Interface name
	static boolean isValid(double price) {
		return price >= 0 && price < MAX_PRICE;
	}
	
	// Default method:
	// used to add method afterwards without risk of compiler error,
	default boolean hasPrice() {
		return price() > 0;
	}
}
