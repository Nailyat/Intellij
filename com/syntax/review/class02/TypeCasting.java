package com.syntax.review.class02;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1=20.6;
		int num2=(int)num1;
		System.out.println(num2);
		num2=45;
		num1=num2;
		System.out.println(num1);
		
		int num3=10;
		int num4=4;
		System.out.println(num3/num4);
		
		double num5=10;
		double num6=4;
		System.out.println(num5/num6); //2.5
		System.out.println(10.0/4); //2.5
		
		//-----------------IfElseCondition------------------//
		String storedUserName="Nailya";
		String storedPassword="pass123";
		Scanner scan=new Scanner(System.in);
		String userName=scan.nextLine();
		System.out.println("Please enter your password");
		String password=scan.nextLine();
		//==operator only works with primitive data types
		//for non primitive data types we should use equals methods
		if(storedUserName.equals(userName)) {
			System.out.println("Correct username");	
		}else {
			System.out.println("Username is not correct");
		}
		
		
		
		
		
	}

}
