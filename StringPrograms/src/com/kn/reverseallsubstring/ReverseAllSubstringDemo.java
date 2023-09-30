package com.kn.reverseallsubstring;

import java.util.Scanner;

public class ReverseAllSubstringDemo {

	public static void main(String[] args) {
		//Taking the input string by users
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String :");
		String inputString = sc.nextLine();
		
		//Creating the ReverseAllSubstring object
		ReverseAllSubstring revese = new ReverseAllSubstring();
		
		//Printing the output String
		System.out.println("Reversed substring is : "+ revese.reverseSubstring(inputString));
		
		//Release the resources
		sc.close();

	}

}
