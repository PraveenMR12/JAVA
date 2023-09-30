package com.kn.stringcomparison;

public class StringComparison3 {

	public static void main(String[] args) {
		
		String s1 = "Ram";
		String s2 = s1;
		
		//Reference Comparison
		if(s1==s2) {
			System.out.println("Reference are same");
			
		}else {
			System.out.println("Reference are Different");
			
		}
		
		//Content Comparison
		if(s1.equals(s2))
			System.out.println("contents are Equal");
		else
			System.out.println("Contents are Unequal");
	}

}
