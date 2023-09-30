package com.kn.firstnonrepeatingchar;

public class FirstNonRepeatingChar {
	public char firstNonRepeatingChar(String inputString) {
		
		for(int i=0; i<inputString.length();i++) {
			
			boolean repeating = false;
			for(int j=0;j<inputString.length();j++) {
				if(i!=j) {
					if(inputString.charAt(i)==inputString.charAt(j)) {
						repeating = true;
						continue;
					}
				}
			}
			if(repeating) {
				continue;
			}else {
				return inputString.charAt(i);
			}
		}
		return '_';
	}
}
