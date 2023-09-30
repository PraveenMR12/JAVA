package com.kn.simpleif;

import java.util.Scanner;

public class DataEntry {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be entered");
		int n=sc.nextInt();
		dataEntryMachine(n);
		sc.close();
	}

	static void dataEntryMachine(int n) {
		if(n>0) {
			System.out.println("Positive Integer-Processing...");
		}
	}

}




//output:

/*Enter the number to be entered
5
Positive Integer-Processing...*/
