package com.kn.switchcase;

import java.util.Scanner;

public class IntegerToWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number =");
		int a = sc.nextInt();
		wordConverter(a);
		sc.close();
	}

	static void wordConverter(int a) {
		switch(a) {
		case 1 :
				System.out.println("one");
				break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6 :
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 0:
			System.out.println("Zero");
			break;
			
		default:
			System.out.println("Enter the number between 0-9 only");	
		}
	}
		

}





//output:

/*Enter anumber =
3
Three

Enter anumber =
7
Seven
*/