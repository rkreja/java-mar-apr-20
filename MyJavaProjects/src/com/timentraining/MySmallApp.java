package com.timentraining;

public class MySmallApp {

	public static void main(String[] args) {		
		

		Car myCar = new Car("Black", 250, 55000, "BMW");
		Car myDadsCar = new Car("White", 180, 37000, "Toyota"); 
		Car myMomsCar = new Car("Red", 190, 35000, "Nissan");
		Car mySisCar = new Car("Pink", 175, 29000, "Ford");
		Car myBrothersCar = new Car("Gray", 230, 45000, "Merceddez");
		Car myFriendsCar = new Car("Yellow", 270, 60000, "Merceddez");
		
		mySisCar.milage();
		mySisCar.drive(115);
		mySisCar.milage();
		mySisCar.drive(35);
		mySisCar.drive(75);
		mySisCar.drive(215);
		mySisCar.milage();
		
		
		myMomsCar.milage();
		
		
		
	}

}


//color
//hp
//price
//milage
//make

//6



