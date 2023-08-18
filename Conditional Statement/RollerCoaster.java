package com.kn.simpleif;

import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		entryTicket(age);
		sc.close();
	}

	static void entryTicket(int age) {
		if(age>12) {
			System.out.println("Ride Access Granted");
			return;
		}
	}

}




//output:

/*Enter your age
18
Ride Access Granted*/