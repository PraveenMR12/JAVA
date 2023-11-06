package com.kn.customexception;

import java.util.Scanner;

public class DrivingLisenceProviderApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the DL app:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		try {
			checkAge(age);
		} catch (UnderAgeException ue) {
			// TODO Auto-generated catch block
			ue.printStackTrace();
		} catch (OverAgeException oe) {
			oe.printStackTrace();
		}
		System.out.println("DL app closed");
	}

	private static void checkAge(int age) throws UnderAgeException, OverAgeException {
		if (age < 18) {
			throw new UnderAgeException("Sorry your age must be above 18");
		} else if (age > 70) {
			throw new OverAgeException("Sorry your age must be below 70");
		} else {
			System.out.println("welcome you can have your DL");
		}
	}

}
