package com.kn.forloop;

import java.util.Scanner;

public class NumTable {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
			System.out.println("Enter the number");
			int num= sc.nextInt();
			table(num);
			sc.close();
		}

		static void table(int num) {
			int n=0;
			for(int i=0;i<=10;i++) {
				n=num*i;
				System.out.println(num+"*"+i+"="+n);
			}
		}
	}