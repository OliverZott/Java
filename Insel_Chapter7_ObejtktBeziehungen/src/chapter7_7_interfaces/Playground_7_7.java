/**
 * Chapter 7.7 - Interfaces
 * 
 * - Interfaces:
 * 		- methods abstract, can't have implementation 
 * 		  (abstract can have instance method with implemented default behavior!)
 * 		- variable declaration by default final
 * 		- can only extend another interface
 * 		- class can implement multiple interfaces (just one abstract)
 * 
 * @author Oliver Zott
 * date: 2020-01-26
 */

package chapter7_7_interfaces;

public class Playground_7_7 {

	public static void main(String[] args) {

		// two classes implement 'Buyable' (same type and same method 'price()'
		Buyable b1 = new Magazine();
		Buyable b2 = new Chocolate();
		// Following not possible because conversion to 'Buyable', which has no price attribute
		//b1.price = 0.2;			
		System.out.println(b1.price());
		System.out.println(b2.price());
		
		
		/*
		 * Example to show idea of interfaces (see calculateSum method)
		 */
		Magazine magMag = new Magazine();
		magMag.price = 2.50;
		Buyable chokolate = new Chocolate();
		Magazine bikeMag = new Magazine();
		bikeMag.price = 3.0;
		
		System.out.printf("sum: %.2f", PriceUtils.calculateSum(bikeMag, chokolate, magMag));
		
		
		/*
		 * Multiple inheritance
		 */
		
		
		
		
	}
}
