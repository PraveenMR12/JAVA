package com.kn.nestedIf;

import java.util.Scanner;

public class StudentPerformance {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Test 1 score =");
		int a = sc.nextInt();
		System.out.println("Enter Test 2 score =");
		int b= sc.nextInt();
		System.out.println("Enter Test 3 score =");
		int c= sc.nextInt();
		dlEligibility(a, b, c);
		sc.close();
	}

	static void dlEligibility(int a, int b, int c) {
		int avg = (a+b+c)/3;
		if(a>50 && b>50 && c>50) {
				System.out.println("Passed All subject");
		}else {
			if(avg>50) {
				System.out.println("Average Score Passed");
			}
		}
		
	}
}








//output:

/*Enter Test 1 score =
60
Enter Test 2 score =
70
Enter Test 3 score =
80
Passed All subject


Enter Test 1 score =
50
Enter Test 2 score =
60
Enter Test 3 score =
70
Average Score Passed

*/










