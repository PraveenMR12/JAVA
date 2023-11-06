package com.kn.interface2;

public class Meal implements MainCourse, Starters, Deserts {

	//we can't reduce the visibility of the implemented method 
	//we should mark as public because it has maximum visibility and in interface default visibility is public
	@Override
	public void iceCream() {
		System.out.println("Chocolete flaver");
		
	}

	@Override
	public void kabab() {
		System.out.println("Chicken kabab");
	}

	@Override
	public void Biryani() {
		System.out.println("Hyderbadi Chicken Dum-Biriyani");
	}

	@Override
	public void enjoy() {
		System.out.println("Enjoying meal");
	}
	
	

}
