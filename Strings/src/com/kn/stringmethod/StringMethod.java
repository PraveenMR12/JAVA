package com.kn.stringmethod;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = "      Praveen    ";
		String s2 = s1.trim();
		System.out.println("Original String\n"+s1);

		System.out.println("\nAfter Trimming\n" +s2);		
		
		System.out.println("\nusing StartsWith");
		System.out.println(s2.startsWith("pra"));

		System.out.println("\nusing endsWith");
		System.out.println(s2.endsWith("een"));
		
		System.out.println("\nConverting to Charector Array ");
		char[] arr =s2.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		
		String s3 = "java is a Programming language";
	
		
		System.out.println("\nAnother Array :\n"+s3);
		
		System.out.println("\nUsing splitting Method ");
		System.out.println(Arrays.toString(s3.split(" ")));
		String s4 = "aaa aaaaaa aaa";
		System.out.println("\nUsing Replace method ");
		System.out.println(s4.replace("aa", "c"));
		String s5 = "aaa aaaaaa aaa";

		System.out.println("\nUsing Replace all method");
		System.out.println(s5.replaceAll("aa", "c"));


		
	}

}
