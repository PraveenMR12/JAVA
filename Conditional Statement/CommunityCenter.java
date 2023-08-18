package com.kn.elseifladder;

import java.util.Scanner;

public class CommunityCenter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		categorizeAge(age);
		sc.close();
	}

	static void categorizeAge(int age) {
		if(age>0&& age <=12) {
			System.out.println("Child");
		}
		else  if(age>12&& age<=19){
			System.out.println("Teen");
		}else if(age>=20 && age<=59){
			System.out.println("Adult");
		}else {
			System.out.println("Senior Citizen");
		}
	}

}





//output:

/*Enter your age
6
Child

Enter your age
15
Teen

Enter your age
25
Adult

Enter your age
65
Senior Citizen
*/
