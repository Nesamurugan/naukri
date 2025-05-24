package com.mypackage;

public class Loops {
	public void for_Loop1() {
		System.out.println("even numbers: ");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 2);
		}
	}

	
	  public void for_Loop2() {
		 System.out.println("Timer: ");
		 for(int i = 5; i>=1; i--) {
			 System.out.println(i);
		 }
		 System.out.println("-----happy new year----");
	  }

	  public void while_Loop1() {
		  int i =1;
		  System.out.println("****3 tables****");
		  while(i<=8){
			  int x = 3*i;
			  System.out.println("3 * " + i + "=" + x);
			  i++;
		  } 
	  }
	  public void while_Loop2() {
		  int i = 13;
		  System.out.println("----reversed odd number----");
		  while(i>=1) {
			  System.out.println(i);
			  i = i-2;
		  }
	  }
	  public void do_While() {
		  boolean bool = true;
		  do {
			System.out.println("will execute once");
		  }while(!(bool)); 
	  }
	 

	public static void main(String[] args) {
		Loops obj = new Loops();
		obj.for_Loop1();
		obj.for_Loop2();
		obj.while_Loop1();
		obj.while_Loop2();
		obj.do_While();
		 
	}

}
