package com.CTP;
/*CTP---1)METHOD OVERLOADING
 * 2)REFERED AS STATIC BINDING OR EARLY BINDING  
 */



public class Customer {
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.purchase("Laptop");
		a.purchase(36000);
		a.purchase("Mobile", 12000);
		a.purchase(500,"Watch");
	}

}
