package com.kn.elseifladder;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		char ch = sc.next().charAt(0);
		input(ch);
		sc.close();
	}

	static void input(char ch) {
		if((int)ch>=97&& (int)ch<=122) {
			
			if(ch =='a'|| ch=='e'||ch =='i'|| ch=='o'||ch=='u') {
				System.out.println("Lowercase Vowel");
			}
			else{
				System.out.println("Lowercase Consonent");
			}
		}else if((int)ch>=65&& (int)ch<=90) {
			if(ch =='A'|| ch=='E'||ch =='I'|| ch=='O'||ch=='U') {
				System.out.println("Uppercase Vowel");
			}
			else{
				System.out.println("Uppercase Consonent");
			}
		}else if((int)ch>=48 && (int)ch<=57){
			System.out.println("Digit");

		}else {
			System.out.println("Special Symbol");
		}
		
	}

}





//output:

/*Enter the number
a
Lowercase Vowel

Enter the number
A
Uppercase Vowel

Enter the number
b
Lowercase Consonent

Enter the number
B
Uppercase Consonent

Enter the number
5
Digit

Enter the number
#
Special Symbol
*/




