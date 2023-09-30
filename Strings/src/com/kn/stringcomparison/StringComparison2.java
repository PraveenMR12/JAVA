package com.kn.stringcomparison;

public class StringComparison2 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = s1 + s2;
		String s4 = s1 + s2;
		
		//Reference Comparison
		if(s3==s4) {
			System.out.println("Reference are same");
			
		}else {
			System.out.println("Reference are Different");
			
		}
		
		//Content Comparison
		if(s3.equals(s4))
			System.out.println("contents are Equal");
		else
			System.out.println("Contents are Unequal");	}

}
