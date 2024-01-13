package com.kn.thread.daemon_thread;

public class CompileCode extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("Compiling Code");
			try {
				super.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
