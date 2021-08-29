package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		int num1, num2, result=0;
		String operator=null;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter two numbers for operating");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		System.out.println("Please enter the operating symbol");
		operator=scan.next();
	
		if(operator.equals("+")) {
			result=num1+num2;
		}else if(operator.equals("-")) {
			result=num1-num2;
		}else if(operator.equals("*")) {
			result=num1*num2;
		}else if(operator.equals("/")) {
			result=num1/num2;
		}else {
			System.out.println("Wrong arithmetic operation");
		}
		System.out.println("The result is "+result);

	
	}
}
