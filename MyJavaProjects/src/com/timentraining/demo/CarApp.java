package com.timentraining.demo;

public class CarApp {

	public static void main(String[] args) {
		
		
		
		Car myCar = new Car();
		
		myCar.getAirController().turnOnAC();
		myCar.getAirController().lowAir();
		myCar.getAirController().mediumAir();
		myCar.getAirController().highAir();
		
		
		AirController a = myCar.getAirController();
		a.turnOnAC();
		a.lowAir();
		a.mediumAir();
		a.highAir();
		
		

	}

}
