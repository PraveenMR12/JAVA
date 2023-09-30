package com.kn.reversewithreservespace;

import java.util.Scanner;

public class ReverseWithSpaceReserveDemo {

	public static void main(String[] args) {
		//Taking the input string by users
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String :");
		String inputString = sc.nextLine();
		
		//Creating the ReverseWithSpaceReserve object
		ReverseWithSpaceReserve revese = new ReverseWithSpaceReserve();
		
		//Printing the output String
		System.out.println("Reversed string is : \n"+ revese.reverseWithSpaceReserve2(inputString));
		
		System.out.println("Reversed string is : \n"+ revese.reverseWithSpaceReserve(inputString));

		//Release the resources
		sc.close();
	}

}
