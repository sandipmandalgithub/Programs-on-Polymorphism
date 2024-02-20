package com.RTP;

public class FoodDeliveryApp {
	void orderFood() {
		System.out.println("Ordered food");
	}

}
class Swiggy extends FoodDeliveryApp{//RULE-1
	@Override
	void orderFood() {//RULE-2
		System.out.println("ordered food from swiggy");
	}
}
class Zomato extends FoodDeliveryApp{//RULE-1
	@Override
	void orderFood() {//RULE-2
		System.out.println("ordered food from zomato");
	}

}
