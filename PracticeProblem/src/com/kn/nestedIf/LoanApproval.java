package com.kn.nestedIf;

import java.util.Scanner;

public class LoanApproval {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age & income");
		int age = sc.nextInt();
		int income= sc.nextInt();
		
		loanApprovalMachine(age, income);
		sc.close();
	}

	static void loanApprovalMachine(int age, int income) {
		if(age>=18) {
			if(income>40000) {
				System.out.println("Loan Approved");
			}
		}
	}

}



//output:

/*Enter age & income
22
50000
Loan Approved

Enter age & income
17
522222
*/





