package com.constructor;
public class Demo {
	String lang;
	
	//Default constructor
	Demo(){
		lang = "python";
		System.out.println("default constructor");
	}
	
	//parameterized constructor
	Demo(String arg){
		lang = arg;
		System.out.println("parameterized constructor");
	}
	//parameterized constructor
	Demo(String arg1 , float arg2){
		lang = arg1;
		float version = arg2;
		System.out.println("java version: "+arg2);
	}
	
	public static void main(String[] args) {
		Demo obj1 = new Demo();
		System.out.println(obj1.lang);
		
		System.out.println();
		
		Demo obj2 = new Demo("c++");
		System.out.println(obj2.lang);
		
		System.out.println();
		
		Demo obj3 = new Demo("java",21.0f);
		System.out.println(obj3.lang);
	}
	
}
