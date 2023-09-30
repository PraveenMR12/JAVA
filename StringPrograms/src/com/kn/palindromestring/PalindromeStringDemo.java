package com.kn.palindromestring;

import java.util.Scanner;

public class PalindromeStringDemo {

	public static void main(String[] args) {
		//Taking Input from a user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String inputString = sc.nextLine();
		
		//Creating a object for palindrome String
		PalindromeString palindromeString= new PalindromeString();
		
		//Checking the String is Palindrome or not
		if(palindromeString.palindromeString(inputString)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not Palindrome");
		}
		
		//Release the Resource
		sc.close();
	}

}
