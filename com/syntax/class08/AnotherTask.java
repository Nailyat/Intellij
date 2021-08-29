package com.syntax.class08;

import java.util.Scanner;

public class AnotherTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that reads a range integers from (start and end point), provided by a user and then from that range prints the sum of the even and odd integers
		 */
		
		Scanner scan=new Scanner(System.in);
		int rangeStart, rangeEnd, evenSum=0, oddSum=0;
		System.out.println("Please enter any ranger of a numbers");
		rangeStart=scan.nextInt();
		rangeEnd=scan.nextInt();
		for(int i=rangeStart; i<=rangeEnd; i++) {
			if(i%2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		System.out.println("Sum of even numbers is "+ evenSum);
		System.out.println("Sum of odd numbers is "+ oddSum);

	
		
		
		
		
		
		
		
		
	}

}
