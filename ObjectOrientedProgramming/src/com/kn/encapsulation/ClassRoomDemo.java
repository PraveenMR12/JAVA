package com.kn.encapsulation;

import java.util.Scanner;

public class ClassRoomDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassRoom c1 = new ClassRoom();
		System.out.println("Enter the classroom Temprature");
		c1.setTemprature(sc.nextInt());
		System.out.println("Temperature ="+ c1.getTemprature());
		sc.close();

	}

}
