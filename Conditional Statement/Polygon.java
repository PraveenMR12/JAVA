package com.kn.switchcase;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of sides=");
		int a = sc.nextInt();
		polygonGuesser(a);
		sc.close();
	}

	static void polygonGuesser(int a) {
		switch(a) {
		case 3: 
				System.out.println("Triangle");
				break;
		case 4 :
				System.out.println("Quadrilateral");
				break;
		
		case 5:
				System.out.println("Pentagon");
				break;
		case 6:
				System.out.println("Hexagon");
				break;
				
		case 7:
				System.out.println("Heptagon");
				break;
		case 8:
	
				System.out.println("Octagon");
				break;
		default:
			System.out.println("enter number between 3-8");
			
		}
	}
}







//output:

/*Enter a number of sides=
4
Quadrilateral

Enter a number of sides=
6
Hexagon
*/






