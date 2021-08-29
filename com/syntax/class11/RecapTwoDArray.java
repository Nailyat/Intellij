package com.syntax.class11;

public class RecapTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] twoDArray={
				{10, 20},
				{1, 2, 3},
				{100, 200, 300, 400}	
		};
		int howManyArrays=twoDArray.length;
		System.out.println(howManyArrays); //3
		System.out.println(twoDArray[2].length); //4
		
		for(int[] arr:twoDArray) {
			for(int total:arr) {
				System.out.print(total+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		for(int r=0; r<twoDArray.length; r++) {
			for (int c=0; c<twoDArray[r].length; c++) {
				System.out.print(twoDArray[r][c]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
