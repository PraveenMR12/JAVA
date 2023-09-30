package com.kn.removeduplicateelement;

import java.util.Scanner;

public class RemoveDuplicateDemo {
	public static void main(String[] args) {
		//Taking Input from a user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String inputString = sc.nextLine();
		
		//Creating a object for remove Duplicate in the String
		RemoveDuplicate removeDuplicates= new RemoveDuplicate();
		
		//Calling the method for remove Duplicate in the String
		System.out.println("After Removing Duplicate = "+removeDuplicates.removeDuplicate(inputString) );
		
		//Release the Resource
		sc.close();
	}

}
