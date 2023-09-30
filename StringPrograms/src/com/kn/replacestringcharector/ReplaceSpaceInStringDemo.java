package com.kn.replacestringcharector;

import java.util.Scanner;

public class ReplaceSpaceInStringDemo {

	public static void main(String[] args) {
		// Taking the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String : ");
		String inputString = sc.nextLine();
		
		//Creating a object for ReplaceSpaceInString String
		ReplaceSpaceInString replaceSpaceInString= new ReplaceSpaceInString();
		
		//Calling the method to replace space with special symbol
		System.out.println(replaceSpaceInString.replaceSpace(inputString));
		
		//Creating a object for ReplaceSpace
		ReplaceSpace replaceSpace = new ReplaceSpace();
		System.out.println(replaceSpace.replaceSpace(inputString));
		
		//Release the Resource
		sc.close();
	}

}
