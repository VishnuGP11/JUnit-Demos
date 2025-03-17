package com.infy.performance;

import java.util.Arrays;

public class SortingPerformance {
	
	public int[] sortingArray(int [] arrayList) {
		
		for(int i=1; i<=100000;i++) {
			Arrays.sort(arrayList);
		}
		
		return arrayList;
	}

}
