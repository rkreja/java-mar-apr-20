package com.timentraining;

public class SmartPhoneApp {

	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone();
		
//		 smartPhone.callToANumber(65655);
		 smartPhone.callToANumber(65655);
		 smartPhone.callToANumber(65655);
		 
//		 smartPhone.callToANumber(65655);
		 
		 int currentCredit = smartPhone.showCredit();
		 
		 System.out.println(currentCredit);
	}

}
