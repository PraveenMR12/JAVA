package com.kn.countcharinstring;

import java.util.Scanner;

public class CountCharInStringDemo {

	public static void main(String[] args) {
		//Taking Input from a user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String inputString = sc.nextLine();
		
		//Creating a object for Reversing a String
		CountCharInString count= new CountCharInString();
		
		//Calling the method for reversing the String
		System.out.println("Reversed String = "+count.countCharDuplicates(inputString) );
		
		//Release the Resource
		sc.close();
	}

}
