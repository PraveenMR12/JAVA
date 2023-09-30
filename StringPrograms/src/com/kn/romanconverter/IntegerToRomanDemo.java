package com.kn.romanconverter;

import java.util.Scanner;

public class IntegerToRomanDemo {
	public static void main(String[] args) {
	//Taking Input from a user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Input number : ");
	int input = sc.nextInt();
	
	//Creating a object for remove Duplicate in the String
	IntegerToRoman romanConv= new IntegerToRoman();
	
	//Calling the method for convertingRoman
//	System.out.println("Roman Number = "+romanConv.intToRoman(input) );
	System.out.println("Roman Number = "+romanConv.intToRoman1(input) );

	
	//Release the Resource
	sc.close();
	}

}
