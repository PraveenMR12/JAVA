package com.kn.countcharinstring;

import java.util.Scanner;

public class CountCharInStringDemo {

	public static void main(String[] args) {
		//Taking Input from a user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String inputString = sc.nextLine();
		
		//Creating a object for counting Duplicate in a String
		CountCharInString count= new CountCharInString();
		
		//Calling the method for counting Duplicate in the String
		System.out.println("Duplicate Char Count = "+count.countCharDuplicates(inputString) );
		
		//Release the Resource
		sc.close();
	}

}
