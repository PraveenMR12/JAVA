package com.self.mon29jan;

class Parent {
	int x = 10;

	void printX() {
		System.out.println("X in Parent: " + x);
	}
}

class Child extends Parent {
	int x = 20;  // Hiding the 'x' field in the superclass

	void printX() {
		System.out.println("X in Child: " + x);
	}
}

public class FieldHiding {
	public static void main(String[] args) {
		Child child = new Child();

		// Accessing the 'x' field in Child
		System.out.println("X in Child: " + child.x);

		// Accessing the 'x' field in Parent using a reference to Child
		Parent parent = child;
		System.out.println("X in Parent: " + parent.x);

		// Invoking the printX method
		parent.printX();  // Calls the overridden method in Child
	}



}
