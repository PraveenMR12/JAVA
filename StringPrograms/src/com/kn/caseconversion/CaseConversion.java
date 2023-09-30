package com.kn.caseconversion;

public class CaseConversion {
	//Method for Converting Cases
	public String conertingCase(String inputString) {
		StringBuffer outputString = new StringBuffer();
		char [] crr = inputString.toCharArray();
		int unicode;
		for(char character : crr ) {
			if((int)character>=65&&(int)character<=90) {
				unicode=(int)character + 32;
				
			}
			else if((int)character>=97&&(int)character<=122) {
				unicode = (int)character - 32;
			}else {
				unicode = (int)character;
			}
			outputString.append((char)unicode);
		}
		
		return outputString.toString();

	}

}
