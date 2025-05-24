package com.Static;

public class class1 {
	public static String lang = "java";//variable level
	float version = 8.0f;
	
	void method(){
		System.out.println("non static method");
	}
	
	protected static void method1() {
		System.out.println("protected static method");
	}
	
	public static void method2() {
		System.out.println("public static method");
	}
	
	private static void method3() {
		System.out.println("private static method");
	}
	
	public static void main(String[] args) {
		method3();
	}
}
