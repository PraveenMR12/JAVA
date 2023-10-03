package com.kn.thread_join;

class Medical_Test extends Thread{
	public void run() {
		try {
				System.out.println("Medical  Test Status : Started");
				Thread.sleep(2000);
				System.out.println("Medical  Test Status : Ended");
				Thread.sleep(1000);
				
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Test_Drive extends Thread{
	public void run() {
		try {
				System.out.println("Test Drive Status : Started");
				Thread.sleep(2000);
				System.out.println("Test Drive Status : Ended");
				Thread.sleep(1000);
				
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Officer_Verification extends Thread{
	public void run() {
		try {
				System.out.println("Officer Signature Status : Started");
				Thread.sleep(2000);
				System.out.println("Officer Signature Status : Ended");
				Thread.sleep(1000);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


public class Thread_Join_Demo {

	public static void main(String[] args) throws InterruptedException {
		Test_Drive t =new Test_Drive();
		t.start();
		t.join();
		
		Officer_Verification o = new Officer_Verification();
		o.start();
		o.join();
		
		Medical_Test m = new Medical_Test();
		m.start();
		m.join();
		
	}

}
