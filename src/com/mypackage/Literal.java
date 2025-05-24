package com.mypackage;

public class Literal {
	public void copying_Array() {
		int[] array1 = {10,20,30,40};
		int[] array2 = new int[4];
		
		
		System.out.println("displaying array1");
		for(int j=0; j<4; ++j) {
			System.out.print("array1["+ j +"]"+" = "+ array1[j] + " ");
		}
		System.out.println();
		
		System.out.println("copying array1 to array2");
		for(int i=0; i<4; ++i) {
			array2[i] = array1[i];
			
		}
		System.out.println("displaying copied array2");
		for(int j=0; j<4; ++j) {
			System.out.print("array2["+j+"]"+" = "+  array2[j] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		Literal obj = new Literal();
		obj.copying_Array();
	}
}
