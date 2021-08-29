package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------TASK 3----------");
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your city.");
		String city=input.nextLine();
		System.out.println("Please enter a temperature in your city at the current time.");
		int temp=input.nextInt();
		double celsius=5*(temp-32)/9;
	
		System.out.println("If the temperature in Fahrenheit, I can convert Fahrenheit to Celsius. The temperature in "+city+" is "+celsius+"C");
		}
		
		

	}


