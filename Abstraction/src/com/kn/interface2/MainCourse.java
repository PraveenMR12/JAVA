package com.kn.interface2;

public interface MainCourse {
	void Biryani();
	public default void enjoy() {
		System.out.println("enjoying");
	}	

}
