package com.kn.switchcase;

import java.util.Scanner;

public class BookLibrary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a genres number :");
		int a = sc.nextInt();
		bookGenres(a);
		sc.close();
	}

	static void bookGenres(int a) {
		switch(a) {
		case 1 :
			System.out.println("Fiction");
			break;
		case 2:
			System.out.println("Non-Fiction");
			break;
		case 3:
			System.out.println("Fantasy");
			break;
		case 4:
			System.out.println("Mystery");
			break;
		case 5:
			System.out.println("Biography");
			break;
			
		default:
			System.out.println("invalid genre Number");	
		}
	}
		

}





//output:

/*Enter a genres number :
3
Fantasy

Enter a genres number :
5
Biography
*/




