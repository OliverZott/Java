package chapter7_7_interfaces2;

public class Magazine extends GameObject implements Buyable, Comparable<Magazine> {

	double price; 
	
	public Magazine(String name, double price) {
		super(name);
		this.price = price;
	}

	@Override
	public int compareTo(Magazine mag_to_compare) {
		return Double.compare(this.price, mag_to_compare.price);
	}

	@Override
	public double price() {
		return price;
	}
	
	@Override
	public String toString() {
		// name is inherited by GameObject super-class
		return name + " " + price;
	}
}
