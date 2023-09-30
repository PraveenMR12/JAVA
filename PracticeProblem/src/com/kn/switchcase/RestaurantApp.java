package com.kn.switchcase;

import java.util.Scanner;

public class RestaurantApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number according to day =");
		int a = sc.nextInt();
		specialDish(a);
		sc.close();
	}

	static void specialDish(int a) {
		switch(a) {
		case 1 :
				System.out.println("Pasta");
				break;
		case 2:
			System.out.println("Tacos");
			break;
		case 3:
			System.out.println("Sushi");
			break;
		case 4:
			System.out.println("Steak");
			break;
		case 5:
			System.out.println("Pizza");
			break;
		case 6:
			System.out.println("Lobster");
			break;
		case 7:
			System.out.println("Brunch");
			break;
		
			
		default:
			System.out.println("Enter the valid day");	
		}
	}
		

}





//output:

/*Enter a number according to day =
1
Pasta

Enter a number according to day =
5
Pizza
*/





