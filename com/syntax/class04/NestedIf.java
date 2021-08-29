package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean vaccine=true;
		boolean secondDose=true;
		if(vaccine) {//yes
			System.out.println("Let's check how many doses you got");
			if(secondDose) {//yes
				System.out.println("You are fully vaccinated");
			}else {//doesn't make sense
				System.out.println("You will need to get a 2nd dose");
			}
			
		}
		System.out.println("End of the code");
		System.out.println("------------------");

		
		boolean vaccine1=true;
		boolean secondDose1=false;
		if(vaccine1) {//yes
			System.out.println("Let's check how many doses you got");
			if(secondDose1) {//no
				System.out.println("You are fully vaccinated");
			}else {//yes
				System.out.println("You will need to get a 2nd dose");
			}
			
		}
		System.out.println("End of the code");
		System.out.println("------------------");
		
		
		boolean vaccine2=false;
		boolean secondDose2=true;
		if(vaccine2) {//no
			System.out.println("Let's check how many doses you got");
			if(secondDose2) {//doesn't make sense
				System.out.println("You are fully vaccinated");
			}else {//doesn't make sense
				System.out.println("You will need to get a 2nd dose");
			}
			
		}
		System.out.println("End of the code");
		System.out.println("------------------");

		System.out.println("------Another example of Nested If-------");
		
		/*
		 * every Friday is a movie day
		 * if it is the 13th --> you want to watch a scary movie
		 */
		System.out.println("--Example N1--");
		int day=13;
		boolean itsFriday=true;
		if(itsFriday) {
		System.out.println("I am going to watch movie");
		if(day==13){
		System.out.println("yay, I am watching scary movie");
		}else {
			System.out.println("I am watching whatever is popular");
		}
		
		}else {
			System.out.println("I am going to study");
		}
		System.out.println("End of code");
		
		System.out.println("--Example N2--");
		int day1=10;//another date
		boolean itsFriday1=true;
		if(itsFriday1) {
		System.out.println("I am going to watch movie");
		if(day1==13){
		System.out.println("yay, I am watching scary movie");
		}else {
			System.out.println("I am watching whatever is popular");
		}
		
		}else {
			System.out.println("I am going to study");
		}
		System.out.println("End of code");
		
		System.out.println("--Example N3--");
		int day2=13;//
		boolean itsFriday2=false; //another day of week
		if(itsFriday2) {
		System.out.println("I am going to watch movie");
		if(day2==13){
		System.out.println("yay, I am watching scary movie");
		}else {
			System.out.println("I am watching whatever is popular");
		}
		
		}else {
			System.out.println("I am going to study");
		}
		System.out.println("End of code");

	}
	

}
