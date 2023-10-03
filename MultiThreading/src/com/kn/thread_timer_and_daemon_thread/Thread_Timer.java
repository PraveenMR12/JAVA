package com.kn.thread_timer_and_daemon_thread;

class NewThread1 extends Thread{
	public void run() {
//		Thread.yield();
		
			try {
				for(int i=0; i<5; i++) {
					super.sleep(1000);
					System.out.println(Thread.currentThread().getName()+" : "+(i+1));
				
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		
	}
}


class NewThread2 implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" : "+(i+1));

			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Thread_Timer {

	public static void main(String[] args) {
		
		NewThread1 nt= new NewThread1();
		nt.start();

		
		NewThread2 t=new NewThread2();
		Thread tr= new Thread(t);
		tr.start();
		

	}

}
