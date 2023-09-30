package com.kn.nestedIf;

import java.util.Scanner;

public class TraficManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age =");
		int a = sc.nextInt();
		System.out.println("your eye sight score (out of 10) =");

		int b= sc.nextInt();
		
		dlEligibility(a, b);
		sc.close();
	}

	static void dlEligibility(int a, int b) {
		if(a>=18) {
			if(b>=6) {
				System.out.println("Driving License Eligible");
			}
		}
		
	}
}







//output:

/*Enter your age =
20
your eye sight score (out of 10) =
7
Driving License Eligible

Enter your age =
20
your eye sight score (out of 10) =
5
*/


