package com.syntax.class04;

public class AnotherNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * we have test-->yes or no
		 * if you done test then I want to check the score
		 * score is more than 90-->A student
		 * score is more than 80-->B student
		 * score is more than 70-->C student
		 * otherwise: you should study more for test
		 */

		System.out.println("--Example 1--");
		boolean isCompleted=true;
		int score=95;
		if(isCompleted) {
			System.out.println("Let's check your score");
			if(score>90) {
				System.out.println("A student");
			}else if(score>80) {
				System.out.println("B student");
			}else if(score>70) {
				System.out.println("C student");
			}
		}else {
			System.out.println("You should have taken the test");
		}
		System.out.println("--Example 2--");
		boolean isCompleted1=true;
		int score1=85;// the score changed
		if(isCompleted1) {
			System.out.println("Let's check your score");
			if(score1>90) {
				System.out.println("A student");
			}else if(score1>80) {
				System.out.println("B student");
			}else if(score1>70) {
				System.out.println("C student");
			}
		}else {
			System.out.println("You should have taken the test");
		}
		System.out.println("--Example 3--");
		boolean isCompleted2=true;
		int score2=75;// the score changed
		if(isCompleted2) {
			System.out.println("Let's check your score");
			if(score2>90) {
				System.out.println("A student");
			}else if(score2>80) {
				System.out.println("B student");
			}else if(score2>70) {
				System.out.println("C student");
			}
		}else {
			System.out.println("You should have taken the test");
		}
		System.out.println("--Example 4--");
		boolean isCompleted3=true;
		int score3=65;// the score changed
		if(isCompleted3) {
			System.out.println("Let's check your score");
			if(score3>90) {
				System.out.println("A student");
			}else if(score3>80) {
				System.out.println("B student");
			}else if(score3>70) {
				System.out.println("C student");
			}else {
				System.out.println("Please study more before taking the test");
			}
		}else {
			System.out.println("You should have taken the test");
		}
		System.out.println("--Example 4--");
		boolean isCompleted4=false;// the test completion changed
		int score4=65;
		if(isCompleted4) {
			System.out.println("Let's check your score");
			if(score4>90) {
				System.out.println("A student");
			}else if(score4>80) {
				System.out.println("B student");
			}else if(score4>70) {
				System.out.println("C student");
			}else {
				System.out.println("Please study more before taking the test");
			}
		}else {
			System.out.println("You should have taken the test");
			
			System.out.println("--------TASK--------");
			System.out.println("Exercise 1");
			boolean diploma=true;
			double gpa=4.0; 
			if(diploma) {
				System.out.println("Congratulations");
				if(gpa>=3.5) {
					System.out.println("You are eligible for scolarship");
				}else if(gpa<3.5) {
					System.out.println("You should have studied harder");
				}
			}else {
				System.out.println("You should get a degree");
			}	
		}
		System.out.println("Exercise 2");
		double rate=2.3;
		int price=185000;
		if(rate>4.5) {
			System.out.println("I will not buy a house with this value of rate"+rate);
		}else {
			System.out.println("I am going to buy this house");
		}
		if(price>200000) {
			System.out.println("I am going to take a loan with "+rate);
		}else {
			System.out.println("I will pay cash");
		}
		System.out.println("Exercise 3");
		int age=22;
		double weight=135.9;
		if(age>18) {
			System.out.println("Let's check weight of the person");
		} if(weight>110.0) {
			System.out.println("The person is eligible to be a donor");
		}else {
		System.out.println("We can not accept such a patient");
	}
	}

	}
