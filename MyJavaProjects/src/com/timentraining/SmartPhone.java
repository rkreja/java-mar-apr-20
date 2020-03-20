package com.timentraining;

public class SmartPhone {
	
	private int credit = 15;
	
	
	public int showCredit() {
		return credit;
	}
	
	public void callToANumber(long n) 
	{
		
		if(credit >0) {
			System.out.println("Calling " + n);
			credit = credit - 5;
		}else {
			System.out.println("Unsufficent credit to call");
		}
		
		
		
	}
	
	
	public void sendTextMessage(int n, String s) {
		
			System.out.println("You sent text message to " + n + ". Message: " + s);
	}
	
	
	public void call911() {
		System.out.println("calling 911");	
	}
	
	
	public void takePhoto() {
		System.out.println("photo taken and saved to photo gallery");	
	}
	
	
	public void openGoogleMap() {
		System.out.println("google map app launched");
	}


	
}
