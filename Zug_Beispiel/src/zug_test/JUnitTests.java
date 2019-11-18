package zug_test;

import zug_beispiel.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 * JUnit unit tests 
 * 
 * generic example for two functions from class "Zug"
 * 
 * @author Oliver Zott
 * @version 1.0 
 */


class JUnitTests {

	Lokomotive lok1 = new Lokomotive(10, 1, "typ_lok1981", "GE", 1981, "sn10", 1, 1000, 6000);  // 1 train guard expected
	Lokomotive lok2 = new Lokomotive(20, 2, "typ_lok1982", "GE", 1982, "sn20", 51, 2000, 5000);  // 1 train guard expected
	Lokomotive lok3 = new Lokomotive(30, 3, "typ_lok1983", "GE", 1983, "sn30", 201, 3000, 5000);  // 4 train guard expected
	
	Wagon wag1 = new Wagon(17, 6, "typ_wag1974", "GE", 1974, "sn1ge", 46, 1200);  
	Wagon wag2 = new Wagon(11.1, 6.3, "typ_wag2012", "GE", 2012, "sn2ge", 52, 1100);

	
	// unit test for function "getSchaffner()"
	@Test
	public void testGetSchaffner_max() {
		Zug tester1 = new Zug(lok1);
		Zug tester2 = new Zug(lok2);
		Zug tester3 = new Zug(lok3);
		
		assertEquals(1, tester1.getSchaffner_max());	
		assertEquals(1, tester2.getSchaffner_max());	
		assertEquals(4, tester3.getSchaffner_max());	
		
	}
	
	
	// unit test for function "fahrfaehig()"
	@Test
	public void testFahrfaehig() {
		Zug tester1 = new Zug(lok1);
		Zug tester2 = new Zug(lok1);
		tester1.addSchiennfahrzeug(wag1);  // Zuladung_max: 5725.0, Zufkraft: 6010.0
		tester2.addSchiennfahrzeug(wag2);  // Zuladung_max: 6075.0, Zufkraft: 6010.0
		
		assertEquals(true, tester1.fahrfaehig());
		assertEquals(false, tester2.fahrfaehig());
	}
}
