package com.kn.nestedIf;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		calender(year);
		sc.close();
	}
	
		

static void calender(int year) {
	if(year%4==0) {
		if(year%100==0) {
			if(year%400==0) {
				if(year>=2000) {
					System.out.println("21st Century Leap Year");
					}else {
						System.out.println("Leap Year");
					}
				
				}else {
					System.out.println("Non-Leap Year");
				}
			}else {
				if(year>=2000) {
					System.out.println("21st Century Leap Year");
					}else {
						System.out.println("Leap Year");
					}
				
			}
		}else {
			System.out.println("Non-Leap Year");
		}
	}
}




//output:

/*Enter Year
2024
21st Century Leap Year


Enter Year
1996
Leap Year
*/




