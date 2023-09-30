package com.kn.stringreverse;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		//Taking Input from a user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String inputString = sc.nextLine();
		
		//Creating a object for Reversing a String
		ReverseString reverseString= new ReverseString();
		
		//Calling the method for reversing the String
		System.out.println("Reversed String = "+ reverseString.reverseString(inputString));
		
		//Release the Resource
		sc.close();
	}

}
