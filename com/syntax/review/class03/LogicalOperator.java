package com.syntax.review.class03;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Logical Operators in Java are && || !
		 * we can use these operators to put multiple conditions in IF blocks
		 */

		System.out.println("------Example 1----------");
		String day="Sunday";
		if("Sunday".equals(day)) { //day.equals("Sunday")
			System.out.println("It's weekend");
		}else if("Saturday".equals("Sunday")) { //day.equals("Saturday")
			System.out.println("It's weekend");
		}
			
		System.out.println("------Example 2----------");
		int number=10;
		if(number==10) {
			System.out.println("Number is 10");
		}
		if(10==number) {
			System.out.println("Number is 10");
		}
		System.out.println("------Example 3----------");
		if (day.equals("Sunday")||day.equals("Saturday")) {
			System.out.println("It's a weekend");
		}else {
			System.out.println("It's a weekday");
		}
	}

	}
