package builder;

import java.util.List;
import java.util.ArrayList;


public class Meal {
	
	
	public List<Item> items = new ArrayList<Item>();
	
	
	// add items to menu 
	public void addItem(Item item) {
		items.add(item);
	}
	
	
	// calculate cost of whole meal
	public float getCost() {
		float cost = 0.0f;
		
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	
	// show item list of meal
	public void showMenu() {
		for(Item item : items) {
			System.out.println("Item: " + item.name());
			System.out.println("Packing: " + item.packing().pack());
			System.out.println("Price: " + item.price());
			System.out.println();
		}
	}
	

}
