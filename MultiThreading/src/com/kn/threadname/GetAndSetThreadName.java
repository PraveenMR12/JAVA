package com.kn.threadname;

public class GetAndSetThreadName {

	public static void main(String[] args) {
//		System.out.println(10/0);
		System.out.println("Before changing the name of the Thread : "+Thread.currentThread().getName());
		Thread.currentThread().setName("Praveen");
		System.out.println("After changing the name of the Thread : "+Thread.currentThread().getName());
		
		System.out.println();
		System.out.println(10/0);
	}

}
