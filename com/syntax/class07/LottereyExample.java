package com.syntax.class07;

import java.util.Scanner;

public class LottereyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we have a secret number (any number from 1 till 20)
		 * ask user to guess your secret number
		 * continue guessing a number untill user enter your secret number
		 */
		
		Scanner scan;
		int userNum, secretNum=15;
		scan=new Scanner(System.in);
		
		do {
		System.out.println("Guess the secret number from 1 to 20");
		userNum=scan.nextInt();
		}while(userNum!=secretNum);
		System.out.println("Great! The secret number is "+secretNum);
	}

}
