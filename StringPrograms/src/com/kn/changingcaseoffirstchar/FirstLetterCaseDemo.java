package com.kn.changingcaseoffirstchar;

import java.util.Scanner;

public class FirstLetterCaseDemo {

	public static void main(String[] args) {
		// Taking the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String :");
		String inputString = sc.nextLine();
		
		//Creating the object of the FirstLetterCase
		FirstLetterCase changeCase=new FirstLetterCase();
		
		//calling the method and printing the output
		System.out.println("Output string = "+ changeCase.firstLetter(inputString));
		
		//Releasing the resources
		sc.close();
		
		
		
		

	}

}
