package com.infy.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shape = new Shapes();
	
	@Test
	void testSquareArea() {
		assertEquals(25,shape.computeSquareArea(5));
	}
	
	// In the string message is considered or evaluated even though the test result is passed
	@Test
	void testCircleArea() {
		assertEquals(78.5,shape.computeCircleArea(5), "Area of circle is wrong");
	}
	
	// In the string message is not considered or evaluated even though the test result is passed
	// this is because of the supplier functional interface which accepts in the assertEquals method
	@Test
	void testCircleArea_Supplier() {
		assertEquals(78.5,shape.computeCircleArea(5), () -> "Area of circle is wrong");
	}
	
	
	
	@Test
	void testFactorial() {
		assertEquals(6,shape.computeFactorial(3));
	}
	
	
	

}