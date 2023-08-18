package com.kn.simpleif;

import java.util.Scanner;

public class VotingRegister {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		votigEligible(age);
		sc.close();
	}

	static void votigEligible(int age) {
		if(age >18) {
			System.out.println("Voter registration eligible");
		}
	}

}



//output:

/*Enter your age
21
Voter registration eligible*/




