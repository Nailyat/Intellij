package com.syntax.class10;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create an array on double values using scanner
		 * Calculate the sum of all elements inside in array
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements do you want to store inside an array?");
		int size=scan.nextInt();
		double sum=0.0;
		
		double[] numbers = new double[size];
		
		for(int i=0; i<size; i++) { 
			System.out.println("Please enter value to be stored to index "+i);
			numbers[i]=scan.nextDouble();
		
			sum=sum+numbers[i];
		}
		System.out.println("The sum of all elements is = "+sum);
	}
	}

