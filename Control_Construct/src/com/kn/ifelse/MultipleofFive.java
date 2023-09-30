package com.kn.ifelse;

import java.util.Scanner;

public class MultipleofFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		boolean ismultiple=product(num);
		if(ismultiple) {
			System.out.println("Multiple of 5");
		}else {
			System.out.println("Not a multiple of 5");
		}
		sc.close();
	}

	static boolean product(int num) {
		if(num%5==0) {
			return true;
		}
		else {
			return false;
		}
	}

}



//output:

/*Enter the number
20
Multiple of 5


Enter the number
23
Not a multiple of 5
*/




