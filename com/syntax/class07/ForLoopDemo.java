package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * For loop syntax
		 * for(initialization; condition; increment/decrement){
		 * code to be repeated;
		 * }
		 */
		
		
		 // I want to say HELLO 5 times
		 
		for(int i=1; i<=5; i++) {
			System.out.println("Hello!");
		}
		
		System.out.println("---------Example of FOR loop-----------");
		// I want to print numbers from 1 to 10
		
		for(int i=1; i<=10; i++) {
			System.out.println(i+" ");
		}
		
		System.out.println("---------Another example of FOR loop-----------");
		// I want print numbers from 10 to 10
		for(int j=20; j>=10; j--) {
			System.out.println(j+" ");
		}
		
		System.out.println("---------Another Example of FOR loop-----------");
		// I want to print even numbers from 10 to 100
		
		for(int n=10; n<=100; n+=2) {
			System.out.print(n+" ");
		}
		
		System.out.println(" ");
		System.out.println("------- Example of FOR loop with IF statement-----------");
		// I want to print even numbers from 10 to 100
		
		for(int n=10; n<=100; n++) {
			if(n%2==0) {
			System.out.print(n+" ");
			}
			
			System.out.println(" ");
			System.out.println("-------------Example of FOR loop-------------");
			// I want to print even numbers from 10 to 100 and step by 10
			
			for(int num=10; num<=100; num+=10) {
				System.out.println(num);
			}
		}
	}

}
