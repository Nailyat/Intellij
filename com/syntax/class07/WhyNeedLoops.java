package com.syntax.class07;

public class WhyNeedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I want to say "HI" 4 times
		
		System.out.println("HI!"); // without loops
		System.out.println("HI!");
		System.out.println("HI!");
		System.out.println("HI!");
		
		int a=1;
		if(a<4) {
			System.out.println("Hello! using IF Statement");
			a++; //increment --> the code will stop when condition is false
		}
		
		while(a<4) {
			System.out.println("HI! using WHILE loop");
		}
		
		//Example of Infinite loop
		/*
		 * while(a<=4){
		 * System.out.println("HI!");
		 * }
		 */


	}

}
