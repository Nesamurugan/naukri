package com.multilevel;

public class Rx100 extends Bike {
	String fuel = "12L";
	
	public void rx100Method() {
		System.out.println("engine_cc: "+ engine_cc +"\n"+
				"tyre "+tyre);
		System.out.println("fuel capacity "+fuel);
	}
}
