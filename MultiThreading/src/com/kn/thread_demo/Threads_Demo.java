package com.kn.thread_demo;

public class Threads_Demo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		Thread.currentThread().setName("Praveen");
		System.out.println("Thread = "+t);
		
	}

}
