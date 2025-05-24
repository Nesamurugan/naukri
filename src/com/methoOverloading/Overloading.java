package com.methoOverloading;

public class Overloading{
	
	public void methodOverload (int num1, int num2) {
		System.out.println("-----Calculation-----");
		int var = num1 + num2;
		System.out.println("result: "+var);
	}
	
	public void methodOverload(float num1, int num2) {
		System.out.println("-----division using modulus-----");
		float var = num1 % num2;
		System.out.println("result: "+var);
	}
	
	public void methodOverload(String str1,float version) {
		String var = str1;
		int len = str1.length()-1;
		
		System.out.println("------iterating a string-------");
		for(int x = len; x>=0; --x) {
			char chr = str1.charAt(x);
			System.out.print(chr);
		}
		System.out.println(" "+version);
	}
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.methodOverload(5,5);   
		obj.methodOverload(5.5f,2);
		obj.methodOverload("avaj",8.0f);
	}
}
