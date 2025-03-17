package com.infy.assertion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayAssertionTest {

	@Test
	void test() {
		int [] actual = {6,4,8,2};
		int [] expected = {2,4,6,8};
		
		Arrays.sort(actual);
		
	//	System.out.println(actual);
		
	// assertEquals(expected,actual);
		
	
		
		assertArrayEquals(expected,actual);
	}

}
