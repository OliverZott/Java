/**
 * Chapter 7.7 - Interfaces 
 * Example 2 (page 517)
 * 
 * - implementing various interfaces
 * - static-interface methods 
 * 
 * @author Oliver Zott
 * date: 2020-01-28
 */

package chapter7_7_interfaces2;

import java.io.Serializable;
import java.util.Arrays;

public class Playgorund {
	
	
	public static void main(String[] args) {
		
		// name and price
		Magazine mag1 = new Magazine("Magazine 1", 1.5);
		Magazine mag2 = new Magazine("Magazine 2", 1.5);	
		Magazine mag3 = new Magazine("Magazine 3", 1.7);	
		
		// just name, no interface methods
		GameObject mag_go = new Magazine("Magazine 2", 2.7);
		
		// no relations to GameObject
		Object mag_o = new Magazine("Magazine 3", 3);
		
		// just price, could be used with 
		Buyable mag_b = new Magazine("Magazine 4", 4);
		
		// has compareTo() but no price
		Comparable<Magazine> mag_c = new Magazine("Magazine_c", 2.7);
		
		// Serializable only marker-interface without methods
		Serializable mag_s = new Magazine("Magazine 2", 2.7);
				
		// overwritten toString method (
		System.out.println(mag1);
		
		System.out.println(mag1.compareTo(mag2));
		System.out.println(mag1.compareTo(mag3));
		
		
		/*	
		 * calculateSum works with any object implementing Byable interface
		 */
		System.out.println(PriceUtils.calculateSum(mag1, mag_b));
		
		
		/*
		 * Comparable also works with any object implementing Comparable interface
		 * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort(byte[])
		 */
		Magazine[] mags = {mag1, mag2, mag3};
		Arrays.sort(mags);
		// specific toString method of Arrays
		System.out.println(Arrays.toString(mags));
		
		
		/*
		 * Static interface-method
		 * Only callable with interface-name
		 */
		System.out.println(Buyable.isValid(123));
		//System.out.println(mag_b.isValid(123));
		//System.out.println(mag1.isValid(123));

	}

}
