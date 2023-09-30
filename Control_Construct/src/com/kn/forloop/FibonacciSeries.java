package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
			System.out.println("Enter the number");
			int num= sc.nextInt();
			fib(num);
			sc.close();
		}

		static void fib(int num) {
			int firstNumber=0;
			int secondNUmber=1;
			System.out.print(firstNumber+" "+secondNUmber+" ");
			int nextNum=0;
			for(int i=3;i<=num;i++) {
				nextNum=firstNumber+secondNUmber;
				System.out.print(nextNum+ " ");
				firstNumber=secondNUmber;
				secondNUmber=nextNum;
			}
		}
	}
