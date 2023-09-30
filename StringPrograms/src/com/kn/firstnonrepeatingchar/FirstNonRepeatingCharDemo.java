package com.kn.firstnonrepeatingchar;

import java.util.Scanner;

public class FirstNonRepeatingCharDemo {

	public static void main(String[] args) {
		//Taking the input string by users
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String :");
		String inputString = sc.nextLine();
		
		//Creating the FirstNonRepeatingChar object
		FirstNonRepeatingChar repeat = new FirstNonRepeatingChar();
		
		//Printing the output String
		System.out.println("NonRepeated character is : \n"+ repeat.firstNonRepeatingChar(inputString));
		
		//Release the resources
		sc.close();
	}

}
