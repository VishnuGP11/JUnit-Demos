package com.infy.testexception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void test() {
		SortingArray sortArray = new SortingArray();
//		try {
//			int[] unsorted = null;
//			int[] sortedList = sortArray.sortingArrayList(unsorted);
//
//			for (int elements : sortedList) {
//				System.out.println(elements);
//			}
//
//			System.out.println("Statements below exception");
//			fail();
//		} 
//		
//		catch (NullPointerException e) {
//			System.out.println("Exception occured " + e);
//		}

		// one is above for passing the test if exception is throwing
		
		// another way is we can use the asserThrows method
		
		int[] unsorted = null;
		assertThrows(NullPointerException.class, ()-> sortArray.sortingArrayList(unsorted));
		

	}

}
