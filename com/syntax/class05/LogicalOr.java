package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Logical OR
		// True || true--> TRUE
		// True || False --> TRUE
		// False || True --> TRUE
		// False || False --> FALSE
		
		/*
		 * define a day
		 * if day is Monday or Friday --> no class
		 * if day is Tuesday or Wednesday --> Manual class
		 * if day is Thursday --> Review class
		 * if day is Saturday or Sunday --> Java class
		 */
		
		String day="Saturday";
		if (day.equals("Monday")|| day.equals("Friday")) {
			System.out.println("No class today");
		}else if(day.equals("Tuesday")||day.equals("Wednesday")) {
			System.out.println("Today is Manual Class");
		}else if(day.equals("Thursday")) {
			System.out.println("Today is Review Class");
		}else {
			System.out.println("Today is Java Class");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
