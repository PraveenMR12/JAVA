package com.kn.threadsdemo1;

public class ThreadsDemo {

	public static void main(String[] args) {
		PrintNumbers t1 = new PrintNumbers();
		t1.start();
		
		PrintCharacters t2 = new PrintCharacters();
		t2.start();
	}

}