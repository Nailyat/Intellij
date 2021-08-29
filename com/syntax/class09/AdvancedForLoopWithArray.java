package com.syntax.class09;

public class AdvancedForLoopWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array of cars and store 6 elements into it
		 * Print all values from the array
		 */
		
		String[] cars= {"Toyota", "BMW", "Lexus", "Honda", "Jeep", "Tesla"};
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}

		System.out.println("-----Advance FOR Loop/ahnaced for loop/for each loop----");
		
		for(String car:cars) {
			System.out.println(car); //shorthand
		}
		
		System.out.println("-----Numbers Array----");
		
		int[] numbers= {100, 20, 30, 43, 45, 56};
		for( int j=0; j<numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		System.out.println("-----Advance FOR Loop/ahnaced for loop/for each loop----");
		for(int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println("-----Char Array----");
		char[] grades= {'A', 'B', 'C'};
		for(char grade:grades) {
			System.out.print(grade+" ");
		}
		System.out.println();
		System.out.println("-----Print Values Backwards----");
		
		for(int i=grades.length-1; i>=0; i--) {
			System.out.print(grades[i]+" ");
		}
	}

}
