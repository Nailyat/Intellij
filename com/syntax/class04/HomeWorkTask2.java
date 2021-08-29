package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------TASK 2-------------");
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your first and last name");
		String name=input.nextLine();
		System.out.println("What is your year of birth?");
		int year=input.nextInt();
		if(year<=2003) {
			System.out.println("Congrats! You are eligeble for a driver license.");
		}else {
			System.out.println("Sorry, your age is too young for a driver license. You can get a lerners permit.");
		}	

	}

}
