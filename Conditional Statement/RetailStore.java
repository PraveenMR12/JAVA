package com.kn.simpleif;

import java.util.Scanner;

public class RetailStore {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Purchased amount");
		int d = sc.nextInt();

		discountPrice(d);
		sc.close();
		
	}

	static void discountPrice(int d) {
		if (d>200) {
			System.out.println("Discount of 20% applicable");
		}
	}

}





//output:

/*Enter The Purchased amount
250
Discount of 20% applicable*/