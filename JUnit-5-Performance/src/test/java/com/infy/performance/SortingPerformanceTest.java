package com.infy.performance;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class SortingPerformanceTest {

	@Test
	void test() {

		SortingPerformance sort = new SortingPerformance();

		int[] unsortedArray = { 8, 35, 1, 67, 3, 2, 8, 50 };

		assertTimeout(Duration.ofMillis(6), () -> sort.sortingArray(unsortedArray));
	}

}
