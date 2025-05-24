package com.multilevel;
public class R15 extends Rx100 {
	int absBreak = 2; 
	
	public void r15Method() {
		System.out.println("engine_cc: "+ engine_cc +"\n"+
				"tyre "+tyre);
		System.out.println("fuel capacity "+fuel);
		System.out.println("total abs break "+ absBreak);
	}
	
	public static void main(String[] args) {
		R15 obj = new R15();
		System.out.println("r15 class method");
		obj.r15Method();
		System.out.println();
		System.out.println("rx100 class method");
		obj.rx100Method();
		System.out.println();
		System.out.println("bike class method");
		obj.bikeMethod1();
	}
}
