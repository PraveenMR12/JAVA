package com.kn.switchcase;

import java.util.Scanner;

public class GardenerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a plant number =");
		int a = sc.nextInt();
		month(a);
		sc.close();
	}

	static void month(int a) {
		switch(a) {
		case 1 :
				System.out.println("Roses-Rose Food");
				break;
		case 2:
			System.out.println("Sunflowers - All Purpose Fertilizer");
			break;
		case 3:
			System.out.println("Orchids - Orchid Fertilizer");
			break;
		case 4:
			System.out.println("Cacti - Cactus Mix");
			break;
		case 5:
			System.out.println("Ferns - Organic Compost");
			break;
			
		default:
			System.out.println("Enter the valid Plant number");	
		}
	}
		

}





//output:

/*Enter a plant number =
1
Roses-Rose Food

Enter a plant number =
5
Ferns - Organic Compost
*/