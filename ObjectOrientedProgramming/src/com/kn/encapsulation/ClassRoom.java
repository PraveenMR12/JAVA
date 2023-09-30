package com.kn.encapsulation;

public class ClassRoom {
	private int temprature;

	public int getTemprature() {
		return this.temprature;
	}

	public void setTemprature(int temprature) {
		if(temprature>=16 && temprature<=26) {
			this.temprature = temprature;
		}
	}
	

}
