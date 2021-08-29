package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String sale;
		double price=0;
		int dis=0;
		double finalPrice;
		
		System.out.println("Hello! Do you have any sales today?");
		 sale=scan.nextLine();
	
		if(sale.equals("yes")) {
			System.out.println("What would you like to buy?");
		 String item=scan.nextLine();
		 
		 System.out.println("Please enter the price");
		 price=scan.nextDouble();
		 
		 if(price>=1 && price<20) {
			dis=10;
		}else if(price>=20 && price<100) {
			dis=20;
		}else if(price>=100 && price <500) {
			dis=30;
		}else if(price>500) {
			dis=50;
		}else {
			System.out.println("Invalid price");
		}
		 finalPrice=price-(price*dis/100);
		 System.out.println("After discount "+dis+"%"+" the price of the "+item+" reduced from $"+price+" to "+finalPrice);
	}else {
		System.out.println("Sorry, no shopping today");
	}
	
		
		
		
		
		
		
	}

}
