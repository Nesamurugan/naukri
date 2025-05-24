package com.method_overriding;

public class Base_Class {
	
	public void method1(float amount,String name) {	
		System.out.println("USD to INR");
		float exchange_Rate = 86.33f ;

		float result = amount* exchange_Rate;
		System.out.println("hello "+name +"your salary in usd "+result);
	}
	
	public void method2(String name){
		System.out.println("i am "+name+" and iam a software developer");
	}
}
//a ->b->c  meth(string arg1,float arg2) 