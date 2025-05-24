package com.mypackage;

public class Variables {
	int a = 10;
	
	public void method1() {
		char b = 'a';
		System.out.println("accessing global variable before changing: "+ a);
		System.out.println("accessing local variable: "+ b);
	}
	
	public void method2() {
		a = 20;
		System.out.println("changing the global variable inside method2 "+ a);
	}
	public static void main(String[] arg) {
		Variables var = new Variables();
		var.method1();
		var.method2();
		System.out.println("modified global variable "+ var.a);
	}
}
