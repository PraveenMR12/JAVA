package com.kn.ifelse;

import java.util.Scanner;

public class FinancialInstitution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your score");
		int amount = sc.nextInt();
		boolean balance=balanceAmount(amount);
		if(balance) {
			System.out.println("Positive Balance");
		}else {
			System.out.println("Negative Balance");
		}
		sc.close();
	}

	static boolean balanceAmount(int amount) {
		if(amount>0) {
			return true;
		}
		else {
			return false;
	}

}
}





//output:

/*Enter your score
500
Positive Balance

Enter your score
-200
Negative Balance
*/



