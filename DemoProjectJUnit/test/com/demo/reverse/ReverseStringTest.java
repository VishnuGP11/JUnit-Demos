package com.demo.reverse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString reverse = new ReverseString();
		String actualResult =  reverse.reverseString("Hello");
		String expectedResult = "olleH";
		//  assertEquals("olleH", reverse.reverseString("Hello"));
		assertEquals(expectedResult,actualResult);
		
	}

}
