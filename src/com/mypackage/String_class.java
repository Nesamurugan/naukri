package com.mypackage;

public class String_class {
	public void imMutable() {
		String str1 = "good";
		String str2 = "good";
		System.out.println("value of str1: " + str1);
		System.out.println("value of str2: " + str2);
		
		System.out.println("------before concatenating str1------");
		System.out.println("memory address of str1's value: " + System.identityHashCode(str1));
		System.out.println("memory address of str2's value: " + System.identityHashCode(str2));
		System.out.println(str1 == str2);
		
		System.out.println("------after concatenating str1------");
		str1 = str1.concat(" day");
		System.out.println("value of str1: " + str1);
		System.out.println("value of str2: " + str2);
		
		System.out.println("memory address of str1's value: " + System.identityHashCode(str1));
		System.out.println("memory address of str2's value: " + System.identityHashCode(str2));
	}
	
	public static void main(String[] args) {
		String_class obj = new String_class();
		obj.imMutable();
	}
}
