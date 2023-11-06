package com.kn.palindromestringarray;

import java.util.Scanner;

public class PalindromeInStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		String[] srr = new String[sc.nextInt()];
		System.out.println("Enter the "+srr.length+" elements to the array");
		for(int i=0; i<srr.length; i++) {
			srr[i]=sc.next();
		}
		palindomeInArray(srr);
		sc.close();

	}

	static void palindomeInArray(String[] srr) {
		boolean isPalindrome=false;
		for(int i=0; i<srr.length; i++) {
			isPalindrome = palindromeOrNot(srr[i]);
			if(isPalindrome) {
				System.out.println("Palindrome in the Array "+srr[i]+" in "+i+" Position");
			}
		}


	}

	static boolean palindromeOrNot(String string) {
		StringBuilder revString = new StringBuilder(string);
		
		return string.equals(revString.reverse().toString());
	}
}
