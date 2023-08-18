package com.kn.ifelse;

import java.util.Scanner;

public class CalenderApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		boolean leapyear=calender(year);
		if(leapyear) {
			System.out.println(" Leap Year");
		}else {
			System.out.println("Non-Leap Year");
		}
		sc.close();
	}

	static boolean calender(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
			
		}
		else {
			return false;
	}

	
	}

}







//output:

/*Enter Year
2020
 Leap Year


Enter Year
2023
Non-Leap Year
*/









