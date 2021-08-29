package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		String month, season;
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your birth month");
		month=scan.nextLine();
		if(month.equals("January") || month.equals("December") || month.equals("February")) {
			season="winter";
		}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			season="spring";
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			season="summer";
		}else  {
			season="Fall";
	}
		System.out.println("You were born in season "+season);
	}
}
