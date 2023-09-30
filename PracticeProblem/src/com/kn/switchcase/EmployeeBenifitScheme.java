package com.kn.switchcase;

import java.util.Scanner;

public class EmployeeBenifitScheme {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year of service");
		int a = sc.nextInt();
		System.out.println("Enter your monthly target met");
		int b=sc.nextInt();
		bonusEligible(a,b);
		sc.close();
	}

	static void bonusEligible(int a, int b) {
		if(a>3&&b>6) {
			System.out.println("Bonus Eligible");	
		}else {
			System.out.println("Not eligible for Bonus");
		}
	}
}





//output:

/*Enter your year of service
4
Enter your monthly target met
7
Bonus Eligible

Enter your year of service
3
Enter your monthly target met
6
Not eligible for Bonus
*/