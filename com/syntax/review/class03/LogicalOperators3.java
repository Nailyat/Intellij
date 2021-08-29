package com.syntax.review.class03;

import java.util.Scanner;

public class LogicalOperators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName="Nailya";
		String password="pass123";
		int availableFunds=500000;
		
		if(userName.equals("Nailya") && password.equals("pass123")) {
			System.out.println("Enter the amount of money that you want to transfer");
			Scanner scan=new Scanner(System.in);
			double transfer=scan.nextDouble();
			if(transfer<availableFunds) {
				System.out.println("Transfer is successfully done");
			}
		}else {
			System.out.println("Invalid credentials");
		}
		
		
		

	}

}
