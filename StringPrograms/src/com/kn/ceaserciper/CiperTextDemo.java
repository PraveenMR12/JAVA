package com.kn.ceaserciper;

import java.util.Scanner;

public class CiperTextDemo {

	public static void main(String[] args) {
		//// Taking the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st input String :");
		String inputString = sc.nextLine();
		System.out.println("Enter the key :");
		int key = sc.nextInt();
		
		//Creating the object of the AnagramString
		CiperText text = new CiperText();
		
		//Printing the Ciper Text
		System.out.println("Ciper text = "+text.ciperText(inputString, key));
		
		//Release the Resource
		sc.close();

	}

}
