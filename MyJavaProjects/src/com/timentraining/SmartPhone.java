package com.timentraining;

public class SmartPhone {
	
	public void callToANumber(int n) 
	{
		
		System.out.println("Calling " + n);
		
		
	}
	public void sendTextMessage(int n, String s) {
		
			System.out.println("You sent text message to " + n + ". Message: " + s);
	}
	
	public void takePhoto() {
		System.out.println("photo taken and saved to photo gallery");	
	}
	
	public void call911() {
		System.out.println("calling 911");	
	}
	
	public void openGoogleMap() {
		System.out.println("google map app launched");
	}


	
}
