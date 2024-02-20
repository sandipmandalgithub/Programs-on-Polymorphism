package com.RTP;

public class MainClass {
	
	// USING GENERIALIZATION
	//Employee obj=new Developer();->obj.work()--Developing app
	//Employee obj=new Tester();->obj.work()--Testing app
	
	static void display(Employee obj) {//RULE-3
		obj.work();
	}
	
	public static void main(String[] args) {
		
		//USING SEPARATE REFERANCE 
		Employee e1=new Developer();//RULE-3 -->UPCASTING
		e1.work();
		Employee e2=new Tester();
		e2.work();
		
		//USING SINGLE REFERENCE
		Employee e3; // RULE-3 -->UPCASTING
		e3=new Developer();
		e3.work();
		e3=new Tester();
		e3.work();
		
		//UPCASTING USING METHOD
		display(new Developer());
		display(new Tester());
		
		
		
	}

}
