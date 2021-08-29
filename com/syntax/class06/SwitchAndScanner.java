package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * I want to ask where are you from?
		 * based on the country we will define traditional?
		 */

		Scanner in;
		String country, traditionalFood;
		in=new Scanner(System.in);
		System.out.println("Where are you from?");
		country=in.nextLine();
		
		switch(country) {
		case "USA":
			traditionalFood="burger";
			break;
		case "Afghanistan":
			traditionalFood="qabeli palaw";
			break;
		case "Peru":
			traditionalFood="cevich";
			break;
		case "Italy":
			traditionalFood="pasta";
			break;
		case "Tajikistan":
			traditionalFood="kuruto";
			break;
		case "Ukraine":
			traditionalFood="bordch";
			break;
		case "Kazakhstan":
			traditionalFood="beshbarmak";
		case "Turkey":
			traditionalFood="borek";
			break;
		default:
			traditionalFood="unknown";
		
			
		}
		System.out.println("You are from "+country+" and your traditional food is "+traditionalFood);
	}

}
