package com.kn.thread.daemon_thread;

public class DaemonDemo {

	public static void main(String[] args) {
		TypingCode t1 = new TypingCode();
		SavingCode t2 = new  SavingCode();
		CompileCode t3 = new CompileCode();
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

}
