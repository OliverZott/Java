package chapter7_7_interfaces;

public class Magazine extends GameObject implements Buyable {
	
	double price;
	
	@Override
	public double price() {
		return price;
	}

}
