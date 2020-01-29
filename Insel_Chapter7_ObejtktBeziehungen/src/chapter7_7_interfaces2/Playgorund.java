package chapter7_7_interfaces2;

import java.io.Serializable;

public class Playgorund {
	
	
	public static void main(String[] args) {
		
		// name and price
		Magazine mag1 = new Magazine("Magazine 1", 1.5);
		Magazine mag2 = new Magazine("Magazine 1", 1.5);	
		Magazine mag3 = new Magazine("Magazine 1", 1.7);	
		
		// just name, no interface methods
		GameObject mag_go = new Magazine("Magazine 2", 2.7);
		
		// no relations to GameObject
		Object mag_o = new Magazine("Magazine 3", 3);
		
		// just price, could be used with 
		Buyable mag_b = new Magazine("Magazine 4", 4);
		
		// has compareTo() but no price
		Comparable<Magazine> mag_c = new Magazine("Magazine 2", 2.7);
		
		// Serializable only marker-interface without methods
		Serializable mag_s = new Magazine("Magazine 2", 2.7);
				
		// overwritten toString method (
		System.out.println(mag1);
		
		System.out.println(mag1.compareTo(mag2));
		System.out.println(mag1.compareTo(mag3));
		
		// method only working with classes implementing Byable interface!
		System.out.println(PriceUtils.calculateSum(mag1, mag_b));
		

	}

}
