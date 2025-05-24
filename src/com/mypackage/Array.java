package com.mypackage;

public class Array {
	public void forEachLoop() {
		char chr[] = new char[4];
		chr[0] = 'N';
		chr[1] = 'e';
		chr[2] = 's';
		chr[3] = 'a';
		
		System.out.println("for each loop");
		for(char i : chr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("----------");
		System.out.println();
	}
	
	public void arrayLoop() {
		int x[] = new int[4];
		x[0] = 10;
		x[1] = 11;
		x[2] = 12;
		x[3] = 13;
		
		for(int j=0; j<x.length; ++j) {
			for(int i=0; i<=j; ++i) {
				System.out.print((x[j])+" ");
			}
			System.out.println();
		}
		
		for(int k=x.length-1; k>=0; --k) {
			for(int l=1; l<=k; ++l) {
				System.out.print((x[k]-1)+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Array arr = new Array();
		arr.forEachLoop();
		arr.arrayLoop();
}
}


