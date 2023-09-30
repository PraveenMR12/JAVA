package com.kn.uniqueelements;

import java.util.Scanner;

public class UniqueElementsDemo {

	public static void main(String[] args) {
		//Taking Input from a user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String inputString = sc.nextLine();
		
		//Creating a object for UniqueElements
		UniqueElements uniqueCharecter= new UniqueElements();
		
		//Calling the method for reversing the String
		System.out.println("Unique Charecters in a String = "+uniqueCharecter.uniqueCharecters(inputString));
		
		//Release the Resource
		sc.close();
	}

}
