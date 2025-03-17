package com.infy.demo;

public class Shapes {

	public int computeSquareArea(int length) {
		return length * length;
	}
	
	public double computeCircleArea(int radius) {
		return 3.14 * radius * radius;
	}
	
	public int computeFactorial(int num) {
		int res = 1;
		for(int i =2;i<=num;i++)
		{
			res *= i;
		}
		return res;
	}
}
