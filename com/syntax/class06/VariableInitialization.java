package com.syntax.class06;

import java.util.Scanner;

public class VariableInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ask user to enter name and age
		 * based on age define who is a user
		 * if age is from 0-2---> you are infant
		 * if age is from 2-5---> you are toddler
		 * if age is from 5-12---> you are big kid
		 * if age is from 12-18---> you are teenager
		 * if age is from 18-65 --->you are adult
		 * if age is 65+ --->you are senior
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		String whoAreYou;
		if(age>=0 && age<3) {
		whoAreYou="infant";
		}else if(age>=2 && age<5) {
			whoAreYou="toddler";
		}else if(age>=5 && age<12) {
			whoAreYou="big kid";
		}else if(age>=12 && age<18) {
			whoAreYou="teenager";
		}else if(age>=18 && age<65) {
			whoAreYou="adult";
		}else if(age>=65){
				whoAreYou="senior";
		}else {
			whoAreYou="allien";
		}
		System.out.println(name+" you are "+whoAreYou);
		
		
		
		
		
		
		
		
		

	}

}
