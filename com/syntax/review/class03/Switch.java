package com.syntax.review.class03;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter two numbers");
		Scanner scan=new Scanner(System.in);
		double  num1=scan.nextDouble();
		double num2=scan.nextDouble();
		System.out.println("Enter the operation");
		char operation=scan.next().charAt(0);
		if(operation=='+') {
			System.out.println(num1+num2);
		}else if(operation=='-') {
			System.out.println(num1-num2);
		}else if(operation=='*') {
			System.out.println(num1*num2);
		}else if(operation=='/') {
			System.out.println(num1/num2);
		}else {
			System.out.println("Operation is not supported");
		}
		
		switch(operation) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			default:
				System.out.println("Operation is not supported");	
		}
			
		
		
		
		

	}

}
