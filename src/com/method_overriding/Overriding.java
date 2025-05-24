package com.method_overriding;

public class Overriding extends Base_Class{
	
	public void method1(float amount,String name)  {
		float exchange_Rate = 86.33f;
		
		System.out.println("INR to USD");
		float result =  amount/exchange_Rate;
		System.out.println("hmethod1(float amount,String name)ello "+name +" your salary is "+result+" dollars");
	}
	
	
	public static void main(String[] args) {
		Overriding obj = new Overriding();
		System.out.println("*****calling overriden method*****");
		obj.method1(50000, "george");
		System.out.println("******calling non-overridden method*****");
		obj.method2("george");
		
	}
}
