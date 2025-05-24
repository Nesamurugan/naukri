package com.mypackage;
import java.util.Scanner;

 public class Scanner_Class {
		
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float balance = 0.0f;
		
		while(true) {
			System.out.println("\nchoose the menu");
			System.out.println("1: deposit\n"
					+ "2: withdraw\n"
					+ "3: check balance");
			
			int var = obj.nextInt();
			obj.nextLine();
			switch(var) {
			case 1:
				System.out.print("enter the amount: ");
				float deposit_Amount = obj.nextFloat();
				balance += deposit_Amount;
				System.out.println("successfully deposited " + deposit_Amount);
				System.out.println("your balance: "+ balance);
				break;
			case 2:
				System.out.print("enter the amount: ");
				float withdraw_Amount = obj.nextFloat();
				balance -= withdraw_Amount;
				System.out.println("succesfully withdrawn "+ withdraw_Amount);
				System.out.println("your balance: "+ balance);
				break;
			case 3:	
				System.out.print("balance: "+ balance);
				break;
			}
			if(var >3) {
				System.out.println("have a great day");
				break;
			}
		}
	}
}
