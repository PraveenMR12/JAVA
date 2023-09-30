package com.kn.validorinvalid;

public class InvalidOrInvalidString {
	public boolean isValidString(String str) {
		int paranthesis=0,curly=0,square=0;
		for(int i=0; i<str.length();i++) {
			switch(str.charAt(i)) {
			case '(': paranthesis++;
						break;
			case ')': paranthesis--;
						break;
			case '{': curly++;
						break;
			case '}': curly--;
						break;
			case '[': square++;
						break;
			case ']': square--;
						break;
			default:	break;
			
			}
		}
		return paranthesis==0&&curly==0&&square==0;
	}

}
