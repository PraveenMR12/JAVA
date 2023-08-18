package com.kn.nestedIf;

import java.util.Scanner;

public class MathsGAme {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a & b");
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		magicSquare(a, b);
		sc.close();
	}

	static void magicSquare(int a, int b) {
		if(a==b) {
			int root =(int)Math.sqrt(a);
			if(root*root==a) {
				System.out.println("Magic");
			}
		}
	}

}



//output:

/*Enter a & b
25
25
Magic

Enter a & b
5
6
*/








