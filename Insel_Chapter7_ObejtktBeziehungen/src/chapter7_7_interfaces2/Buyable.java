package chapter7_7_interfaces2;

interface Buyable {
	
	int MAX_PRICE = 1_000_000;
	double price();
	
	// Interfaces can only implement static methods!
	// Can only be called with Interface name
	static boolean isValid(double price) {
		return price >= 0 && price < MAX_PRICE;
	}
	
}
