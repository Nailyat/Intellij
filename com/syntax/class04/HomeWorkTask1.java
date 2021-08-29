package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------Task 1-----");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your first and last name");
		String name=input.nextLine();
		System.out.println("What is your credit score");
		int score=input.nextInt();
		int num=750;
		if(score<=num) {
		System.out.println("Sorry, your score is too low for loan request");
		}else {
			System.out.println("Great! What is the amount of loan do you need?");
		}
			int loan=input.nextInt();
			if(loan<=200000) {
				System.out.println("Congratulation! You are eligible for this amount of loan");
		}else {	
				System.out.println("Sorry, the amount of loan is too high. We have to decline the request");
			}
			
	}

}
