package com.kn.thread.multiple_task_in_one_thread;

public class ThreadDemo {

	public static void main(String[] args) {
		NewThread t1 = new NewThread();
		NewThread t2 = new NewThread();
		
		t1.setName("Numbers");
		t2.setName("Charecters");
		
		t1.start();
		t2.start();

		
		

	}

}
