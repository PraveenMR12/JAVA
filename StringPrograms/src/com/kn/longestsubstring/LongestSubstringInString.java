package com.kn.longestsubstring;

public class LongestSubstringInString {
	
	//method for Longest Substring
	public String longestWord(String inputString) {
		String outputString = new String();
		String[] srr = inputString.split(" ");
		int temp =0;
		for (int i=0 ; i<srr.length; i++) {
			if(srr[i].length()>temp) {
				temp = srr[i].length();
				outputString = srr[i];
				
			}
			
		}
		
		return outputString;
	}
	
}
