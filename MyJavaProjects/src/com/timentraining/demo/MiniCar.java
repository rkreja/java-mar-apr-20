package com.timentraining.demo;

public class MiniCar {
	private int fuelCapacity=50;
	private int milePerLitre = 10;
	private int milage=0;
	
	
	public void drive(int mile) {
		
		if(( mile/ milePerLitre ) <= fuelCapacity) {
			System.out.println("Car driven " + mile + " mile");
			milage = milage + mile;
			fuelCapacity =  fuelCapacity -(mile/milePerLitre);
			System.out.println("Total milage on this car is: "+ milage);
			
		}else {
			System.out.println("You have unsufficent fuel to drive "+mile+" mile");
		}
		
		
		
	}
	
	
	

}
