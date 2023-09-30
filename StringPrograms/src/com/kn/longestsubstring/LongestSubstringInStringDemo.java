package com.kn.longestsubstring;

import java.util.Scanner;

public class LongestSubstringInStringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking the input string
		System.out.println("Enter the inputString");
		String inputString= sc.nextLine();
		
		//Creating the Object for LongestSubstringInString
		LongestSubstringInString longestWord = new LongestSubstringInString();
		
		//Printing the Longest String
		System.out.println("Longest String = "+longestWord.longestWord(inputString));
		
		//Releasing the resource
		sc.close();
		
		
	}

}
