package com.Final;

public class class1 {
	final int var1  = 20;
	
	public final void method1() {
		System.out.println("calling final method");
	}
	public static void main(String[] args) {
		class1 ref = new class1();
		ref.method1();
	}
}
