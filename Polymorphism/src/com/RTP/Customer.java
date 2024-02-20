package com.RTP;

public class Customer {

	// USING GENERIALIZATION
	//FoodDeliveryApp obj=new Swiggy();->obj.orderFood()--Developing app
	// FoodDeliveryApp obj=new Zomato();->obj.orderFood()--Testing app
	
	static void display(FoodDeliveryApp obj) {//RULE-3
		obj.orderFood();
	}
	
	public static void main(String[] args) {
		
		//USING SEPARATE REFERANCE 
		FoodDeliveryApp fd=new Swiggy();//RULE-3 -->UPCASTING
		fd.orderFood();
		Zomato z=new Zomato();
		z.orderFood();
		
		//USING SINGLE REFERENCE
		FoodDeliveryApp fda; // RULE-3 -->UPCASTING
		fda=new Swiggy();
		fda.orderFood();
		fda=new Zomato();
		fda.orderFood();
		
		//UPCASTING USING METHOD
		display(new Swiggy());
		display(new Zomato());
		
		
		
	}


}
