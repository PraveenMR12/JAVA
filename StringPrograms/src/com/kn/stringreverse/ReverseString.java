package com.kn.stringreverse;

public class ReverseString {
	//Create the method for reverse the String
	public String reverseString(String inputString) {
		StringBuffer outputString = new StringBuffer();
		for(int i=inputString.length()-1;i>=0;i--) {
			outputString.append(inputString.charAt(i));
		}
		return outputString.toString();
	}
}
