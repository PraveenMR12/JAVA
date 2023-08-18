package com.kn.switchcase;

import java.util.Scanner;

public class RomanNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Roman number =");
		String a = sc.next();
		romanConverter(a);
		sc.close();
	}

	static void romanConverter(String a) {
		switch(a) {
		case "I":
				System.out.println("1");
				break;
		case "II":
			System.out.println("2");
			break;
		case "III":
			System.out.println("3");
			break;
		case "IV":
			System.out.println("4");
			break;
		case "V":
			System.out.println("5");
			break;
		default:
			System.out.println("Enter the roman numbers in Capital Letter and 1-5 only");	
		}
	}
		

}





//output:

/*Enter a number =
I
1

Enter a number =
IV
4
*/








