package com.syntax.class03;

public class MoreIfExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=30;
		double b=20;
		if (a==b) { //condition musr be a boolean value
			System.out.println("Numbers are equal");
			System.out.println("My numbers are twins");
		}else {
			System.out.println("Numbers are not equal");
			System.out.println("Numbers are not twins");
			System.out.println("I am else block code");
			
		}

		System.out.println("--------------------------");
		
		//if it is a break time --> I will get a coffee otherwise i will focus on the class
		
		boolean isBreakTime=true;
		if (isBreakTime==true) {
			System.out.println("I am getting my coffee");
		}else {
			System.out.println("I am focusing on the class");
			
			/*
			 * if you are hungry-->I wiil eat
			 * otherwise --> I will go hate a tea
			 */
			
			
			boolean isHungry=true;
			if (isHungry) {
				System.out.println("I will eat");
			}else {
				System.out.println("I wiil go have a tea");
				
			}
		}
	}

}
