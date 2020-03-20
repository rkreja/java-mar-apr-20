package com.timentraining.demo;

public class Car {
	private int milage = 0;
	
	public int showMilage() {
		return milage;
	}
	
	
	public Radio getRadio() {
		Radio r = new Radio();
		return r;
	}
	
	
	public AirController getAirController() {
		AirController a = new AirController();
		return a;
	}
	

}
