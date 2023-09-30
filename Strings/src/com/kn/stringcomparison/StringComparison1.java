package com.kn.stringcomparison;

public class StringComparison1 {

	public static void main(String[] args) {
		String s3 = "Ram" + "Sita";
		String s4 = "Ram" + "Sita";
		
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
			System.out.println("Contents are Unequal");
	}

}
