package com.kn.nestedIf;

import java.util.Scanner;

public class UniversityApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter GPA =");
		double a = sc.nextDouble();
		System.out.println("Number of Credits =");

		int b= sc.nextInt();
		
		eligibleForDegree(a, b);
		sc.close();
	}

	static void eligibleForDegree(double a, int b) {
		if(a>3.5) {
			if(b>120) {
				System.out.println("Eligible for Honors Degree");
			}
		}
	}

}






//output:

/*Enter GPA =
3.7
Number of Credits =
125
Eligible for Honors Degree

Enter GPA =
3.3
Number of Credits =
130
*/







