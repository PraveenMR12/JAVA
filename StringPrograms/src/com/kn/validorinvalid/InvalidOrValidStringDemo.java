package com.kn.validorinvalid;

import java.util.Scanner;

public class InvalidOrValidStringDemo {

	public static void main(String[] args) {
		//Taking Input from a user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String inputString = sc.nextLine();
		
		//Creating a object for InvalidOrValidString
		InvalidOrInvalidString isValidOrInvalid= new InvalidOrInvalidString();
		
		//Calling the method for remove Duplicate in the String
		if(isValidOrInvalid.isValidString(inputString)) {
			System.out.println("The given string is valid");
		}else {
			System.out.println("The given string is invalid");
		}
		
		//Release the Resource
		sc.close();
	}

}
