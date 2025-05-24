package com.mypackage;

public class Main {
	public void addition() {
		System.out.println(2+2);
	}
	
	public void method() {
		System.out.println(2*4);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.addition();
		obj.method();
	}
}
