package com.timentraining;

public class Human {
	
	private String name = "John";
	private int age = 30;
	private boolean disability = false;
	
	
	public Human() {
		
	}
	public Human(String newName) {
		name = newName;
	}
	public Human(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	public Human(String newName, int newAge, boolean newDisablity) {
		name = newName;
		age = newAge;
		disability = newDisablity;
	}
	
	
	
	public void walk() {
	
		System.out.println("human is walking...");
	
	}

	public void whatIsYourName() {
		System.out.println("My name is " + name);
		
	}
	
	
	public void youAreDisable() {
		System.out.println(disability);
	}
	
	
	
	
	

}
