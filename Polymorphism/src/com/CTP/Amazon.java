package com.CTP;

public class Amazon {
	void purchase(String product) {
		System.out.println("product:"+product);

	}
	void purchase(int cost) {
		System.out.println("Cost:"+cost);

	}
	void purchase(String product,int cost) {
		System.out.println("Product:"+product+" Cost:"+cost);

	}
	void purchase(int cost,String product) {
		System.out.println("Cost:"+cost+" Product:"+product);

	}



}
