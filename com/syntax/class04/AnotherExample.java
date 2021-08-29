package com.syntax.class04;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		//let's capture first and last name
		
		System.out.println("Please enter your name");
		
		String name=input.nextLine(); //press enter button -->
		
		System.out.println("Please enter your last name");
		
		String lastName=input.nextLine();
		
		System.out.println("Please tell me country where are from");
		
		String country=input.nextLine();
		
		System.out.println("Nice to meet you "+name+" "+lastName+" from "+country);
		
		/*
		 * next() - is used to capture a String value of first word before space
		 * nextLine() - is used to capture String value (full line including space)
		 */
		
		
		
	}

}
