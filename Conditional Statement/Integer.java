package com.kn.elseifladder;

import java.util.Scanner;

	public class Integer {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			input(num);
			sc.close();
			
		}

		static void input(int num) {
			if(num<0) {
				System.out.println("Negative");
			}
			else  if(num>0){
				System.out.println("Positive");
			}else {
				System.out.println("zero");
			}
		}
}
	
	
	
//output:

/*Enter the number
-45
Negative

Enter the number
0
zero

Enter the number
89
Positive
*/
	
	
	
