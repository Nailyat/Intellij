package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Using Scanner create an Array of int elements;
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements do you want to store inside an array?");
		int size=scan.nextInt();
		
		int[] numbers=new int[size];
		
		for(int i=0; i<size; i++) { //i<numbers.length
			System.out.println("Please enter value to be stored to index "+i);
			numbers[i]=scan.nextInt();
		}
		System.out.println("------------DISPLAY ALL ELEMENTS FROM AN ARRAY------------");
		
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		
		
		
		
		
		
		
		
	}

}
