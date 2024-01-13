package com.kn.countcharinstring;

public class CountCharInString {
	public int countCharDuplicates(String inputString) {
		char[] crr = inputString.toCharArray();
		int count=0;
		for(int i=0 ; i<crr.length;i++) {
			for(int j=i+1;j<crr.length;j++) {
				if(crr[i]==crr[j] && crr[j] !=' ') {
					count++;
					crr[j]=' ';
				}
				
			}
		}
		return count;
	}
}
