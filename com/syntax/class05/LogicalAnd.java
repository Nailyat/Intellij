package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Logical AND (&&) operator 
		// false&&false-->FALSE
		// true&&true-->TRUE
		// true&&false-->FALSE
		// false&&true-->FALSE
		
		boolean understandJava=true;
		boolean enjoy=true;
		
		if(understandJava && enjoy) { //logical operators in Java
			System.out.println("That is awesome!");
		}else {
			System.out.println("Please try spend more time with Java.");
		}
		
		
		System.out.println("-----------Another Example-----------");
		/*
		 * declare a number
		 * if num is larger 1 and smaller than 10--> SMALL
		 * if num is larger 10 and smaller than 100--> Medium
		 * if num is larger 100 and smaller than 1000--> Large
		 * otherwise num is Huge
		 */
		
		
		int num=65497968;
		if(num>=1 && num<10) {
			System.out.println("Small");
		}else if(num>=10 && num<100) {
			System.out.println("Medium");
		}else if(num>=100 && num<1000) {
			System.out.println("Large");
		}else if(num>0 && num>1000){
			System.out.println("Huge");
		}else if(num==0){
			System.out.println("Zero");
		}else {
			System.out.println("Negative");
		}
	}

}
