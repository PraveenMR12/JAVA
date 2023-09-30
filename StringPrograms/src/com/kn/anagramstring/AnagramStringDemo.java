package com.kn.anagramstring;

import java.util.Scanner;

public class AnagramStringDemo {

	public static void main(String[] args) {
		// Taking the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st input String :");
		String inputString1 = sc.nextLine();
		System.out.println("Enter the 2st input String :");
		String inputString2 = sc.nextLine();
		
		//Creating the object of the AnagramString
		AnagramString isAnagram = new AnagramString();
		
		if (isAnagram.isAnagram(inputString1, inputString2)) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are not Anagram");

		}
		
		//Release the Resource
		sc.close();
		

	}

}
