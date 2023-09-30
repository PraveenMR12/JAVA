package com.kn.encapsulation;

public class DogApp {

	public static void main(String[] args) {
		Dog d1=new Dog("Swan","Black",10,"Local");
		System.out.println("Dog name ="+d1.getName());
		System.out.println("Color ="+d1.getColor());
		System.out.println("Dog age ="+d1.getAge());
		System.out.println("Dog breed ="+d1.getBreed());
		d1.setName("Devu");
		d1.setColor("White");
		d1.setAge(9);
		d1.setBreed("Local");
		System.out.println("Dog name ="+d1.getName());
		System.out.println("Color ="+d1.getColor());
		System.out.println("Dog age ="+d1.getAge());
		System.out.println("Dog breed ="+d1.getBreed());
		
		Dog d2=new Dog("Raj","Pink",1,"Husky");
		System.out.println("Dog name ="+d2.getName());
		System.out.println("Color ="+d2.getColor());
		System.out.println("Dog age ="+d2.getAge());
		System.out.println("Dog breed ="+d2.getBreed());
		d2.setName("Lac");
		d2.setColor("Blue");
		d2.setAge(9);
		d2.setBreed("German");
		System.out.println("Dog name ="+d2.getName());
		System.out.println("Color ="+d2.getColor());
		System.out.println("Dog age ="+d2.getAge());
		System.out.println("Dog breed ="+d2.getBreed());
		
		Dog d3=new Dog("SSSS","Red",15,"Local");
		System.out.println("Dog name ="+d3.getName());
		System.out.println("Color ="+d3.getColor());
		System.out.println("Dog age ="+d3.getAge());
		System.out.println("Dog breed ="+d3.getBreed());
		d3.setName("XXX");
		d3.setColor("White");
		d3.setAge(9);
		d3.setBreed("Local");
		System.out.println("Dog name ="+d3.getName());
		System.out.println("Color ="+d3.getColor());
		System.out.println("Dog age ="+d3.getAge());
		System.out.println("Dog breed ="+d3.getBreed());
	}

}
