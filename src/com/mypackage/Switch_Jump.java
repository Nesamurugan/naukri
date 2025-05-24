package com.mypackage;
public class Switch_Jump {
	public void method1() {
		int x = 6;
		switch(x) {
		case 6:
			System.out.println("case a is running");
			break;
		
		case 5:
			System.out.println("case b is running");
			break;
			
		case 4:
			System.out.println("case c is running");
			break;
		
		default:
			System.out.println("no case is matched");
		}
	}
	public void method2() {
		int x = 0;
		System.out.println("printing odd numbers");
		
		while(x<20){
			x+=1;
			if(x%2 == 0) {
				continue;
			}
			else if(x == 19) {
				break;
			}
			System.out.println("x: "+ x);
		}
	}
	public static void main(String[] args) {
		Switch_Jump obj = new Switch_Jump();
		obj.method1();
		obj.method2();
	}
	
}
