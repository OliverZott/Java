package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllTests {

	@Test
	void testAddition() {
		
		// to test MyClass
		MyClass tester = new MyClass();
		
		
		assertEquals(0, tester.myAddition(17, -17));
		assertEquals(10, tester.myAddition(6, 4));
		assertEquals(-27, tester.myAddition(-30, 3));
		
	}

}
