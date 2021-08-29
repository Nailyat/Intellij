package com.syntax.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char gender='M';
		switch(gender) {
		case 'M':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
			break;
			default:
				System.out.println("Gender is unknown");
		}	
				
		
		System.out.println("-----------LIMITATIONS---------");
		//boolean boo=true; -->switch(boo){   too few variables
		//Double d=1.99; -->switch (d){   too many variables
		// Matching cases are not allowed
		// Switch is using ONLY in equation statement (==) and can't be used in logical and relational operations(<>)
		
		
		
		
		
		
			}
		}

	


