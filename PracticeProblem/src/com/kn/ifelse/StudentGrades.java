package com.kn.ifelse;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your score");
		int score = sc.nextInt();
		boolean Pass=gradingSystem(score);
		if(Pass) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		sc.close();
	}

	static boolean gradingSystem(int score) {
		if(score>60) {
			return true;
		}
		else {
			return false;
		}
	}

}






//output:

/*Enter your score
75
Passed

Enter your score
55
Failed
*/


