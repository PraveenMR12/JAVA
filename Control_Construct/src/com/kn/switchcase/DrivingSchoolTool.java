package com.kn.switchcase;

import java.util.Scanner;

public class DrivingSchoolTool {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color :");
		String light = sc.next();
		lightIndicater(light);
		sc.close();
	}

	static void lightIndicater(String color) {
		switch(color) {
		case "Red" :
				System.out.println("Stop");
				break;
		case "Green":
			System.out.println("Go");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
	
		default:
			System.out.println("Enter correct color with capital letter starting");	
		}
	}
		

}





//output:

/*Enter the color :
Red
Stop

Enter the color :
Green
Go
*/