package com.syntax.class03;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program to check whether number is positive or negative
		 */
		
		int number = 0;
		if(number>0) {
			System.out.println(number+" is positive number");
			
		}else if (number<0) {
			System.out.println(number+" is a negative number");
		}else {
			System.out.println("Your number is "+number);
		}

		/*
		 * Write a Java program to check whether number is even or odd
		 */
		
		int evenOdd=16;
		if(evenOdd%2==0) {
			System.out.println(evenOdd+" is an even number");
		}else {
			System.out.println(evenOdd+" is an odd number");
		}
	}

}
