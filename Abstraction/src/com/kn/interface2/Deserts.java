package com.kn.interface2;

public interface Deserts {
	void iceCream();
	public default void enjoy() {
		System.out.println("enjoying");
	}	

}
