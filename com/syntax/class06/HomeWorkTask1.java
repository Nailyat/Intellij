package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		String country, language;
		scan=new Scanner(System.in);
		System.out.println("Where are you from?");
		country=scan.nextLine();

		switch(country) {
		case "USA":
			language="English";
			break;
		case "Kazakhstan":
			language="Kazakh";
			break;
		case "France":
			language="French";
			break;
		case "Italia":
			language="Italian";
			break;
		case "Russia":
			language="Russian";
			break;
		default:
			language="unknown";
	}
		System.out.println("You are from "+country+" and your language is "+language);
	}
	
}
