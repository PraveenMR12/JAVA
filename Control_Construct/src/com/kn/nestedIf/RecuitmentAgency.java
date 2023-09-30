package com.kn.nestedIf;

import java.util.Scanner;

public class RecuitmentAgency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Experience =");
		int a = sc.nextInt();
		System.out.println("Skill level =");

		int b= sc.nextInt();
		
		suitableEmployee(a, b);
		sc.close();
	}

	static void suitableEmployee(int a, int b) {
		if(a>5) {
			if(b>7) {
				System.out.println("Suitable Candidate");
			}
		}
		
	}
}




//output:

/*Enter Experience =
6
Skill level =
8
Suitable Candidate

Enter Experience =
5
Skill level =
6

*/





