package com.kn.robo_inheritance;

public class RoboDemo {
	public static void main(String[] args) {
		ChefRobo cr = new ChefRobo();
		DriverRobo dr = new DriverRobo();
		TeacherRobo tr = new TeacherRobo();
		
		
		System.out.println("ChefRobo name = "+cr.name);
		System.out.println("ChefRobo type = "+cr.type);
		cr.charge();
		cr.talk();
		cr.walk();
		cr.cook();
		System.out.println();
		
		
		System.out.println("DriverRobo name = "+dr.name);
		System.out.println("DriverRobo type = "+dr.type);
		dr.charge();
		dr.talk();
		dr.walk();
		dr.drive();
		System.out.println();
		
		
		System.out.println("TeacherRobo name = "+tr.name);
		System.out.println("TeacherRobo type = "+tr.type);
		tr.charge();
		tr.talk();
		tr.walk();
		tr.teach();
	}
}
