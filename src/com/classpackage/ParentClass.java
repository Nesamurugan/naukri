package com.classpackage;

public class ParentClass {
	
	public int x= 10;
	private float y = 4.5f;
	protected char z = 'a';
	boolean a = true;
	
	
	public void publicMethod() {
		System.out.println("public method");
	}
	
	private void privateMethod() {
		System.out.println("private method");
	}
	
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	
	void defaultMethod() {
		System.out.println("default method");
	}
}
