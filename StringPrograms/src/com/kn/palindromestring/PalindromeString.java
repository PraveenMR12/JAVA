package com.kn.palindromestring;

public class PalindromeString {
	//Create the method to check String is Palindrome or not
	public boolean palindromeString(String inputString) {
		StringBuffer reverseString = new StringBuffer();
		for(int i=inputString.length()-1;i>=0;i--) {
			reverseString.append(inputString.charAt(i));
		}
		return inputString.equals(reverseString.toString());
	}
}
