package com.mypackage;

public class Statements {
	//float celsius;
	
	public void conditional_Method() {
		int score = 66;
		
		if(score >= 50 && score < 100) {
			System.out.println("half century");
		}
		else if(score >= 100){
			System.out.println("century");
		}
		else if(score == 0) {
			System.out.println("duck out");
		} 
		
		else {
			System.out.println("havent played yet");
		}
	}
	public void weather() {
		float celsius = 20.2f;
		
		if(celsius > 30.0  || celsius == 30) {
			System.out.println("the weather "+ celsius + " is too hot");
		}
		else if (celsius < 30 && celsius > 20.0) {
			System.out.println("the weather "+ celsius+" is mild");
		}
		else {
			System.out.println("the value is default which is absolute zero temp");
		}
	}
	
	public static void main(String[] args) {
		Statements var  = new Statements();
		var.conditional_Method();
		var.weather();
	}
}
