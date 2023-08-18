package com.kn.simpleif;

import java.util.Scanner;

public class TypingSkill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type the letter");
		char letter = sc.next().charAt(0);
		capsdetector(letter);
		sc.close();
	}

	static void capsdetector(int letter) {
		
		if ((int)letter>=65&&(int)letter<=90) {
			System.out.println("Capital letter detected");
		}
		
		
	}

}






//output:

/*Type the letter
A
Capital letter detected

Type the letter
d
*/





