package com.timentraining;

public class Car {
	
	private String color= "Black";
	private int hp = 200;
	private int price = 15000;
	private String make = "Toyota";
	private int milage = 0;
	

	public Car() {
		
	}
	
	public Car(String newColor, int newHp, int newPrice, String newMake) {
		color = newColor;
		hp = newHp;
		price = newPrice;
		make = newMake;
	}
	
	public void color() {
		System.out.println(color);
	};
	
	public void hp() {
		System.out.println(hp);
	};

	public void price() {
		System.out.println(price);
	};
	
	public void make() {
		System.out.println(make);
	};
	public void milage() {
		System.out.println(milage);
	};
	

	
	
	public void drive(int mile) {
		System.out.println("You have driven "+mile+" mile");
		milage = milage + mile;
	}
	
}
