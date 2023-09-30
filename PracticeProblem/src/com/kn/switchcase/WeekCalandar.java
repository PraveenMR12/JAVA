package com.kn.switchcase;

import java.util.Scanner;

public class WeekCalandar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		weekdayNumber(a);
		sc.close();
	}

	static void weekdayNumber(int a) {
		switch(a) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		
			
		default:
			System.out.println("Enter the valid Weekday Number");	
		}
	}
		

}





//output:

/*Enter a number :
5
Friday

Enter a number :
1
Monday
*/




