package com.ThisKeyword;

public class SubClass extends SuperClass {
	String var = "child class variable";
	
	public void subMethod() {
		System.out.println("child class method");
	}
	
	public void submethod2() {
		//calling current class method
		this.subMethod();
		//calling parent class method
		super.topMethod1();
	}
	
	public void subMethod3() {
		//calling current class variable
		System.out.println(this.var);
		//calling parent class variable
		System.out.println(super.var);
	}
	
	public static void main(String[] args) {
		SubClass ref = new SubClass();
		ref.subMethod();
		System.out.println();
		
		ref.submethod2();
		System.out.println();
		
		ref.subMethod3();
	}
}
