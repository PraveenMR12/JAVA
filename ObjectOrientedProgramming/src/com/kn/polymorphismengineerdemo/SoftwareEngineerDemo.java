package com.kn.polymorphismengineerdemo;

public class SoftwareEngineerDemo {

	public static void main(String[] args) {

		BackendEngineer be = new BackendEngineer();
		DataBaseEngineer de = new DataBaseEngineer();
		JavaBackendEngineer je = new JavaBackendEngineer();
		PythonBackendEngineer pe = new PythonBackendEngineer();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		doActivity(be);
		doActivity(de);
		doActivity(je);
		doActivity(pe);

	}
	
	
	
	public static void doActivity(SoftwareEngineer se) {

		se.attendMeeting();
		se.doTesting();
		if(se instanceof BackendEngineer) {
			if(se instanceof JavaBackendEngineer) {
				((JavaBackendEngineer) se).learnJava();
				((JavaBackendEngineer) se).doBackendProject();

			}else if(se instanceof PythonBackendEngineer) {
				((PythonBackendEngineer) se).learnPython();
				((PythonBackendEngineer) se).doBackendProject();
			}else {
				((BackendEngineer) se).doBackendProject();
			}
		}
		if(se instanceof DataBaseEngineer) {
			((DataBaseEngineer) se).doDataBaseProject();
			se.doTesting();
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

	}

}
