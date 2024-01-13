package com.kn.panagramstring;

public class Panagram {

	public static void main(String[] args) {
		String s = "abbcdefghijklmnopqrstuvwxyz";
		isPanagram(s);

	}

	private static void isPanagram(String s) {
		boolean[] alp = new boolean[26];
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<= 'z') {
				alp[s.charAt(i)-'a']=true;
			}
		}
		boolean isPan=true;
		for(int i=0; i<alp.length; i++) {
			if(!alp[i]) {
				isPan=false;
				break;
			}
		}
		if(isPan) {
			System.out.println("Panagram String");
		}else {
			System.out.println("Not a Panagram String");
		}
	}

}
