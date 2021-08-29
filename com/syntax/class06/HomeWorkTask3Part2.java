package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask3Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		double num1, num2, result;
		String operator=null;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter two numbers for operating");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		
		System.out.println("Please enter the operating symbol");
		operator=scan.next();

		switch(operator) {
		
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
			default:
				result=0;
		}
		if(result!=0) {
		System.out.println("The result is "+result);
		}
		
			
		


		}
	}


