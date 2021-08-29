package com.syntax.class02;

public class IdentifiersExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// rules:
		/*
		 * Identifiers - name we give to classes, variables and methods
		 * Keywords cannot be used as Identifiers
		 * Identifiers can't start with number
		 * Identifiers can't have special characters (except _, and, $)
		 */

		char singleLetter='c';
		//boolean new=true; don't use keyword to name your variables
		
		int  num=100;
		
		boolean boo=true;
		double $price=2.99;
		//byte ^b=1; error
		
		//Preferences:
		/* 
		 * follow camel casing
		 * Java Classes should start with capital letters and follow camel casing
		 * Variables and method in Java should start with lower case letters and follow camel casing
		 */
		
		short thisIsMyShortNum=10;
		System.out.println(thisIsMyShortNum);
		
	}

}
