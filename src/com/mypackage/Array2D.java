package com.mypackage;

public class Array2D {
	public void arrayLiteral_1() {
		int[][] array = {{2,4,6,8}, {1,3,5}, {0,0}};
		
		System.out.println("using for loop on 2D array");
		for(int i=0; i<3; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}	
	public void arrayLiteral_2() {
		char[][] chr = {{'j','a','v','a'}, {'p','r','o','g','r','a','m'}};
		
		System.out.println("using for each loop on 2D array");
		for(char[] a : chr) {
			for(char b : a) {
				System.out.print(b+ " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Array2D obj = new Array2D();
		obj.arrayLiteral_1();
		obj.arrayLiteral_2();
	}
}
