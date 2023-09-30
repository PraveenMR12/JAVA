package com.kn.switchcase;

import java.util.Scanner;

public class MonthCalender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Month number =");
		int a = sc.nextInt();
		month(a);
		sc.close();
	}

	static void month(int a) {
		switch(a) {
		case 1 :
				System.out.println("31");
				break;
		case 2:
			System.out.println("28");
			break;
		case 3:
			System.out.println("31");
			break;
		case 4:
			System.out.println("30");
			break;
		case 5:
			System.out.println("31");
			break;
		case 6:
			System.out.println("30");
			break;
		case 7:
			System.out.println("31");
			break;
		case 8:
			System.out.println("31");
			break;
		case 9:
			System.out.println("30");
			break;
		case 10:
			System.out.println("31");
			break;
		case 11:
			System.out.println("30");
			break;
		case 12:
			System.out.println("31");
			break;
		default:
			System.out.println("Enter the valid month number");	
		}
	}
		

}





//output:

/*Enter a Month number =
5
31

Enter a Month number =
11
30
*/