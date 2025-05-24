package com.mypackage;
public class Array_2d {
	public void twoDarray() {
		int[][] set = {{2,4,6,8},{1,3,5,7},{7,3,6,0}};
		System.out.println("length of 2d array -> 'set' =  "+set.length);
		
		for(int i=0; i<3; ++i) {
			System.out.println("displaying "+"'"+ i+"'"+ " index array");
			for(int j=0; j<4; ++j) {
				System.out.print(set[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("using for each loop ");
		for(int[] x: set) {
			for(int y:x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Array_2d obj = new Array_2d();
		obj.twoDarray();
	}
}