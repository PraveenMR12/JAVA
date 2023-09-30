package com.kn.reverseallsubstring;

public class ReverseAllSubstring {
	//Creating the method to reverse the substrings
	public String reverseSubstring(String inputString) {
		StringBuffer outputString = new StringBuffer();
		String [] srr = inputString.split(" ");
		for(String subString : srr ) {
			for(int i=subString.length()-1; i>=0; i--) {
				outputString.append(subString.charAt(i));
			}
			outputString.append(" ");
		}
		
		return outputString.toString().trim();
	}

}
