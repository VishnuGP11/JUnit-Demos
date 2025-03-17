package com.infy.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c1 = new Calculator();
		int actualResult = c1.divide(10, 5);
		int expectedResult = 2;
		assertEquals(expectedResult,actualResult);
		
//		
//		actualResult = c1.multiply(10, 2);
//		expectedResult = 20;
//		assertEquals(expectedResult,actualResult);
//		
	}

}
