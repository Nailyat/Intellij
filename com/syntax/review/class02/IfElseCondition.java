package com.syntax.review.class02;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String storedUserName="Nailya";
		String storedPassword="pass123";
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your username");
		String userName=scan.nextLine();
		System.out.println("Please enter your password");
		String password=scan.nextLine();
		//==operator only works with primitive data types
		//for non primitive data types we should use equals methods
		if(storedUserName.equals(userName)) {
			System.out.println("Correct username");	
			if(storedPassword.equals(password)) {
				System.out.println("Password is correct");	
			}else {
				System.out.println("Username is correct but password is not");
			}
		}else {
			System.out.println("Username is not correct");
		}
		
	}

}
