package com.mypackage;
public class Nested_statements {
	public void nested_Loop() {
		
		for(int i = 2; i<4; ++i) {
			System.out.println(i + "____tables____");
			
			for(int j=1; j<=5; ++j) {
				System.out.println(i + "*" + j + "=" + i*j + " ");
			}
			
		}
	}
	public void nested_If1() {
		System.out.println();
		for(int i=1; i<=5; ++i) {
			for(int j=0; j<i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void police_Selection() {
		int height = 180;
		int weight = 75;
		
		if(height >= 170) {
			System.out.println("passed the height criteria");
			if(weight > 70 && weight <= 85) {
				System.out.println("passed both height and weight criteria");
			}
			else {
				System.out.println("passed 1 out 2");
			}
		}else {
			System.out.println("unfit");
		}
	}
	public static void main(String[] args) {
		Nested_statements obj = new Nested_statements();
		obj.nested_Loop();
		obj.nested_If1();
		obj.police_Selection();
	}
}
