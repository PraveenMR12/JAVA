package com.kn.ifelse;

import java.util.Scanner;

public class HotelBooking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		boolean discount=hotelDiscount(age);
		if(discount) {
			System.out.println("Senior Citizen Discount Applicable");
		}else {
			System.out.println("Regular Charges Applicable");
		}
		sc.close();
	}

	static boolean hotelDiscount(int age) {
		if(age>=60) {
			return true;
		}
		else {
			return false;
		}
	}

}






//output:

/*Enter your age
65
Senior Citizen Discount Applicable

Enter your age
45
Regular Charges Applicable
*/






