package com.demo.reverse;

public class ReverseString {
	
	public String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		
		// swape the left and right character of string
		
		while(left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			left++;
			right--;
		}
		// creating new string object to convert character arry to string.
		return new String(charArray);
				
		
	}

}
