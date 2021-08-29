package com.syntax.class10;

public class Task1TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
			//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String	[][] names= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		System.out.println(names[0][1]+" "+names[1][0]+", "+names[0][0]+" "+names[1][3]+", "+names[0][2]+" "+names[1][2]+", "+names[0][3]+" "+names[1][1]);
		
		System.out.println("--------------");
		
		//how get all values from 2D array
		
		for(int r=0; r<names.length; r++) { //outer loop iterates over rows
			for(int c=0; c<names[r].length; c++) { //inner loop iterates over columns
				System.out.println(names[r][c]);
			}
		}
		
		System.out.println("-------------------");
		
		for(String[] arr:names) {
		
		for(String a:arr) {
			
			System.out.print(a+" ");
		}
		System.out.println();
		}
		
		
		
		}
}
