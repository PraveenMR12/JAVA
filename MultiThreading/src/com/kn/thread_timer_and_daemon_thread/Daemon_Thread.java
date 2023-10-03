package com.kn.thread_timer_and_daemon_thread;

class NewThread extends Thread{
	public void run() {
		if(super.isDaemon()) {
			System.out.println(Thread.currentThread().getName()+" is Daemon Thread");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" is Common Thread");
		}
		
	}
}

public class Daemon_Thread {

	public static void main(String[] args) {
		
		System.out.println("Main Thread is Daemon Thread = "+Thread.currentThread().isDaemon());
		
		NewThread t = new NewThread();
		t.setDaemon(true);
		t.start();
		

	}

}
