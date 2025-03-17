package com.infy.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shape = new Shapes();
	
	@Test
	void testSquareArea() {
		assertEquals(25,shape.computeSquareArea(5));
	}
	
	@Test
	void testCircleArea() {
		assertEquals(78.5,shape.computeCircleArea(5));
	}
	
	@Test
	void testFactorial() {
		assertEquals(6,shape.computeFactorial(3));
	}
	
	
	

}
