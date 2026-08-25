package com.self.wed31jan;

import java.util.Scanner;

public class DreamOrbit1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your current earth weight :");
		double weight  = sc.nextDouble();
		System.out.println("\nI have information for the following planets:\r\n\n1. Venus   2. Mars    3. Jupiter\r\n4. Saturn  5. Uranus  6. Neptune");
		System.out.print("\nWhich planet are you visiting?");
		int n = sc.nextInt();
		double newWeight =0;
		switch (n) {
		case 1: 
			newWeight = weight*0.78;
			break;
		case 2: 
			newWeight = weight*0.39;
			break;
		case 3: 
			newWeight = weight*2.65;
			break;
		case 4: 
			newWeight = weight*1.17;
			break;
		case 5: 
			newWeight = weight*1.05;
			break;
		case 6: 
			newWeight = weight*1.23;
			break;
		default:
			System.out.println("Choose the appropriate option");
		}
		System.out.println("\nYour weight would be "+ newWeight +" pounds on that planet.");
		sc.close();
	}
}