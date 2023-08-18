package com.kn.switchcase;

import java.util.Scanner;

public class SolarSystem {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Planet in the solar system");
		String planet = sc.next();
		planetNumber(planet);
		sc.close();
	}

	static void planetNumber(String a) {
		switch(a) {
		case "Mercury":
				System.out.println("1");
				break;
		case "Venus":
			System.out.println("2");
			break;
		case "Earth":
			System.out.println("3");
			break;
		case "Mars":
			System.out.println("4");
			break;
		case "Jupiter":
			System.out.println("5");
			break;
		case "Saturn":
			System.out.println("6");
			break;
		case "Uranus":
			System.out.println("7");
			break;
		case "Neptune":
			System.out.println("8");
			break;
		default:
			System.out.println("Invalid planet name");	
		}
	}
		

}





//output:

/*Enter a Planet in the solar system
Earth
3

Enter a Planet in the solar system
Saturn
6
*/