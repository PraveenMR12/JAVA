package com.kn.changingcaseoffirstchar;

public class FirstLetterCase {
	//Creating the method for changing case of FirstLetter 
	public String firstLetter(String inputString) {
		StringBuffer outputString = new StringBuffer();
		String [] srr = inputString.split(" ");
		
		for (int i=0 ; i<srr.length;i++) {
			char[] crr= srr[i].toCharArray();
			if(srr[i].charAt(0)>=97 && srr[i].charAt(0)<=122) {
				crr[0]=(char)(srr[i].charAt(0)-32);
				
			}
			
			for(char c: crr) {
				outputString.append(c);
			}outputString.append(" ");
		
		}
		return outputString.toString();
		
	}

}
