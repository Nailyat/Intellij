package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking.

		
		Scanner scan=new Scanner(System.in);
		String answer;
		
		do {
				System.out.println("Would you like to apply for a credit vard");
				answer=scan.nextLine();
				if(answer.equalsIgnoreCase("yes")) {
					break;
				}
			
		}while(!scan.equals("yes"));
		System.out.println("Great!");
		
		System.out.println("---------------------------------------");
		
		for (int i=1; i<5; i++) {
		System.out.print(i +" ");	
		}

	}

}
