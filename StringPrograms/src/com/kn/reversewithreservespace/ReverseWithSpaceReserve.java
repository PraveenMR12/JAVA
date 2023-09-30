package com.kn.reversewithreservespace;

public class ReverseWithSpaceReserve {
	public String reverseWithSpaceReserve(String inputString) {
		
		StringBuffer outputString = new StringBuffer();
		char []crr= inputString.toCharArray();
		char [] reverseCrr = new char[crr.length];
		int j = crr.length-1;
		for(int i=0 ; i<crr.length;i++) {
			if(crr[i]==' ') {
				reverseCrr[i]=' ';
			}
		}
		for(int i=0;i<crr.length;i++) {
			if(crr[i]!= ' ') {
				if(reverseCrr[j]==' ') {
					j--;
				}
				reverseCrr[j]=crr[i];
				j--;
			}
		}
		
		
		for(int i=0; i<reverseCrr.length;i++) {
			outputString.append(reverseCrr[i]);
		}
		
		return outputString.toString();
	}
	
public String reverseWithSpaceReserve2(String inputString) {
		
		StringBuffer outputString = new StringBuffer();
		char []crr= inputString.toCharArray();
		char [] reverseCrr = new char[crr.length];
		//Adding the Space
		for(int i=0 ; i<crr.length;i++) {
			if(crr[i]==' ') {
				reverseCrr[i]=' ';
			}
		}
		//Adding the other elements
		int i=0, j=crr.length-1;
		while(i<reverseCrr.length) {
				if(crr[j]!=' ') {
					if(reverseCrr[i]!=' ') {
						reverseCrr[i]=crr[j];
						j--;
					}
					i++;
				
			}else {
				j--;
			}
		}
		for(i=0; i<reverseCrr.length;i++) {
			outputString.append(reverseCrr[i]);
		}
		
		return outputString.toString();
	}
}
