package com.self.thread_interrupt;

class NewThread1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());


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

public class Thread_Interupt {

	public static void main(String[] args) {
		
		NewThread1 nt= new NewThread1();
		nt.start();
		nt.interrupt();

	}

}
