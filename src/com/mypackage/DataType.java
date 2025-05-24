package com.mypackage;

public class DataType {
	public void method1() {
		byte var1 = 120;
		int var2 = 250;
		long l  = 4878337836864l;
		System.out.println("addition: " + var1 + var2);
		System.out.println("modulus: " + var2 % var1);
		System.out.println("division: " + var2 / var1);
		System.out.println("long type: "  + l);
	}
	
	public void method2() {
		float num1 = 57.0f;
		double num2 = 100.550;
		char a = 'X';
		System.out.println(num1 > num2);
		System.out.println(a == num2);
		System.out.println(num1 < num2);
	}
	
	public void method3() {
		boolean ref1 = true;
		boolean ref2 = false;
		System.out.println("logical and: " + (ref1 && ref2));
		System.out.println("logical or: " + (ref1 || ref2));
		System.out.println("logical not: " + !(ref1 && ref2));
	}
	
	public static void main(String[] args) {
		DataType obj = new DataType();
		obj.method1();
		obj.method2();
		obj.method3();
		
	}
}
