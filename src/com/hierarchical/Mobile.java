package com.hierarchical;

public class Mobile {
	String screen ="led" ;
	int batteryMAh = 5000;
	
	public void mobileMethod() {
		System.out.println("mobile class method");
		System.out.println("screen: "+screen+"\n"+
							"batteryMAh: "+batteryMAh);
	}
}