package com.RTP;

public class Employee {
	void work() {
		System.out.println("working");
	}

}
class Developer extends Employee{//RULE-1
	@Override
	void work() {//RULE-2
		System.out.println("Developing app");
	}
}
class Tester extends Employee{//RULE-1
	@Override
	void work() {//RULE-2
		System.out.println("Testing app");
	}

}
