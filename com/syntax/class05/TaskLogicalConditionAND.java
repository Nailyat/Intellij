package com.syntax.class05;

import java.util.Scanner;

public class TaskLogicalConditionAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Prompt the user to enter person heights in inches
		 * Person should be classified as one of the following condition: 1.Short(under 60 in) 2.Medium(between 60-72 in) 3.Tall(over 72 in)
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height=scan.nextInt();
		 if(height<60) {
			 System.out.println("Short");
		 }else if(height>=60 && height<72) {
			 System.out.println("Medium");
		 }else if(height>72) {
			 System.out.println("Tall");
		 }
		
	
		

	}

}
