package com.kn.switchcase;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number according to your choice =");
		int a = sc.nextInt();
		productsInVedingMachine(a);
		sc.close();
	}

	static void productsInVedingMachine(int a) {
		switch(a) {
		case 1 :
				System.out.println("Coke");
				break;
		case 2:
			System.out.println("Pepsi");
			break;
		case 3:
			System.out.println("Water");
			break;
		case 4:
			System.out.println("Juice");
			break;
		case 5:
			System.out.println("Tea");
			break;
		
			
		default:
			System.out.println("Enter the valid number");	
		}
	}
		

}





//output:

/*Enter a number according to your choice =
3
Water

Enter a number according to your choice =
5
Tea
*/