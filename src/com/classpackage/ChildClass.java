package com.classpackage;

public class ChildClass extends ParentClass {
	public void method1() {
		System.out.println("child class method");
	}
	
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.method1();
		obj.publicMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		
		System.out.println("parent class publicvar "+obj.x);
		
		System.out.println("parent class protectedvar "+obj.z);
		System.out.println("parent class defaultvar "+obj.a);
	}
}

