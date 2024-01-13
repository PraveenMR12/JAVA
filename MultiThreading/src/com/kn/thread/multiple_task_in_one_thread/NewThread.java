package com.kn.thread.multiple_task_in_one_thread;

public class NewThread extends Thread {
	@Override
	public void run() {
		if(this.getName().equalsIgnoreCase("Numbers")) {
			printNumbers();
		}else {
			printCharecters();
		}
	}

	private void printCharecters() {
		System.out.println("Printing Numbers Started");
		for(int i=1; i<=10;i++) {
			System.out.println(i+" ");
		}
		System.out.println();
		System.out.println("Printing Numbers Ended");
		
	}

	private void printNumbers() {
		System.out.println("Printing Charecters Started");
		for(int i=65; i<=75;i++) {
			System.out.println((char)i+" ");
		}
		System.out.println();
		System.out.println("Printing Charecters Ended");
		
	}

}
