package com.kn.anagramstring;

public class AnagramString {
	//method to check anagram or not
	public boolean isAnagram(String s1, String s2) {
		boolean isAnagram=false;
		char crr1[] = s1.toCharArray();
		char crr2[] = s2.toCharArray();
		if(s1.length()==s2.length()) {
			for(int i=0; i<crr1.length; i++) {
				boolean isPresent=false;
				for(int j=0; j<crr2.length; j++) {
					if(crr1[i]==crr2[j]) {
						crr2[j]='_';
						isPresent= true;
						isAnagram = true;
						break;
					}
				}
				if(!isPresent) {
					isAnagram = false;
					break;
				}
			}
			
		}
		
		return isAnagram;
	}
}
