package com.syntax.class04;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//compare 2 numbers and see which one is the largest
	
		Scanner data=new Scanner(System.in);//then press ctrl+shift+o (reminder)
		
		System.out.println("Please enter the first number");
		int num1=data.nextInt();
		
		System.out.println("Please enter the second number");
		int num2=data.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if (num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num2+ " is equal to "+num1);
		}
		

	}

}
