package com.kn.switchcase;

import java.util.Scanner;

public class GameToFind {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gold coin number you have=");
		int a = sc.nextInt();
		System.out.println("Enter your level=");
		int b=sc.nextInt();
		System.out.println("do you have a special key-- for yes type Y and For no type N");
		char ch=sc.next().charAt(0);
		secretGame(a,b,ch);
		sc.close();
	}

	static void secretGame(int a, int b,char ch) {
		if(a>10&&b>5) {
			if(ch=='y'||ch=='Y')
		System.out.println("Special Item Found");
			else {
				System.out.println("Special item not Found");
			}
	}else {
		System.out.println("Not eligible for Game");
	}
}
		

}





//output:

/*Enter gold coin number you have=
12
Enter your level=
20
do you have a special key-- for yes type Y and For no type N
y
Special Item Found

Enter gold coin number you have=
5
Enter your level=
3
do you have a special key-- for yes type Y and For no type N
n
Not eligible for Game
*/