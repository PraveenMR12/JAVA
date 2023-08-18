package com.kn.nestedIf;

import java.util.Scanner;

public class LearnEnglish {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 0-9=");
		int a = sc.nextInt();
		numberToLetter(a);
		sc.close();
	}

	static void numberToLetter(int a) {	
		if(a>=0||a<=9) {
			if(a==1) {
				System.out.println("One");
			}if(a==2) {
				System.out.println("Two");
			}if(a==3) {
				System.out.println("Three");
			}if(a==4) {
				System.out.println("Four");
			}if(a==5) {
				System.out.println("Five");
			}if(a==6) {
				System.out.println("Six");
			}if(a==7) {
				System.out.println("Seven");
			}if(a==8) {
				System.out.println("Eight");
			}if(a==9) {
				System.out.println("Nine");
			}if(a==0) {
			System.out.println("Zero");
			}
		}	
	}
}






//output:

/*Enter a number between 0-9=
3
Three

Enter a number between 0-9=
7
Seven
*/





