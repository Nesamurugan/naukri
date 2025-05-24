package com.Superkeyword;

public class DerivedClass extends BaseClass {
	String name = "child class variable";
	
	public void method1() {
		System.out.println(name);
		System.out.println("calling child class method");
	}
	
	public void method2() {
		//calling parent class variable
		System.out.println(super.name);
		//calling parent class method
		super.method1();               
	}
	
	public static void main(String[] args) {
		DerivedClass a = new DerivedClass();
		a.method1();
		System.out.println();
		a.method2();
	}
}
