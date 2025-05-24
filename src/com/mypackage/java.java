package com.mypackage;
  
public class java {
	public void method1() {
		
		for(int i=1; i<=4; ++i){
			for(int j=0; j<i; ++j) {
				System.out.print("@");
			}
			System.out.println();
		}
		for(int i=3; i>=1; --i){
			for(int j=0; j<i; ++j) {
				System.out.print("@");
			}
			System.out.println();
		}
		
	}	
	
	public static void main(String[] args) {
		java obj = new java();
		obj.method1();
	}
}

	

	
	