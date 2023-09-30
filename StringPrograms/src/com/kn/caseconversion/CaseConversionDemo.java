package com.kn.caseconversion;

import java.util.Scanner;

public class CaseConversionDemo {

	public static void main(String[] args) {
		// Taking the input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String inputString = sc.nextLine();
		
		//Create the object for CaseConvertion 
		CaseConversion caseConvertion = new CaseConversion();
		
		//printing the output
		System.out.println("Converted String = "+ caseConvertion.conertingCase(inputString));
		
		//Releasing the Resource
		sc.close();
	}

}
