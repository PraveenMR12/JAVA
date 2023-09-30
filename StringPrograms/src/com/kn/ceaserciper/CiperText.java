package com.kn.ceaserciper;

public class CiperText {
	public String ciperText(String inputText, int key) {
		while(key>25) {
			key=key-25;
		}
		StringBuffer outputString = new StringBuffer();
		for(int i=0; i<inputText.length();i++) {
			if(inputText.charAt(i)<=90-key) 
				outputString.append((char)(inputText.charAt(i)+key));
			else if(inputText.charAt(i)<=90)
				outputString.append((char)(inputText.charAt(i)+key-25));
			else if(inputText.charAt(i)<=122-key)
				outputString.append((char)(inputText.charAt(i)+key));
			else
				outputString.append((char)(inputText.charAt(i)+key-25));
		}
		
		return outputString.toString();
		
	}

}
