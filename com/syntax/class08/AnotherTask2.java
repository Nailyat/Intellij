package com.syntax.class08;

import java.util.Scanner;

public class AnotherTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to ask a user to enter item they want to buy and the price of that item. 
		//Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		//If user give more money program should return a change. Whenever a user done with payments program should say “Thank you for shopping!”
		
		Scanner scan=new Scanner(System.in);
		int price, money, total=0, change=0;
		String item;
		System.out.println("Please enter the item and the price");
		item=scan.nextLine();
		price=scan.nextInt();
		
		System.out.println("Please pay for your item");
		
		do {
			money=scan.nextInt();
			total+=money;
			
			if(total>price) {
				change=total-price;
				System.out.println("Your change is "+change);
				break;
			
			} else if(total<price) {
			System.out.println("You should add "+(price-total));
		}  else {
			System.out.println("That is the exact amount"); 
		}
			
		}while(money!=price);
		System.out.println("Thank you for shopping");

		
		
	}
	
	

}
