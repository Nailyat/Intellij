package com.syntax.HW14;

import java.util.Scanner;

public class ScannerAndStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that reads two people's first names and if they expecting boy or girl? 
         * Based on the input suggests a name for a baby:
         * Example Output:
                Mom’s first name? Mary
                Dad’s first name? Daniel
                Boy or Girl? boy
                Suggested baby name: DANRY
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter dad's name");
		String dadsName=scan.nextLine();
		System.out.println("Please enter mom's name");
		String momsName=scan.nextLine();
		System.out.println("Who do you expect, a boy or a girl?");
		String expectation=scan.nextLine();
		
		if(expectation.equalsIgnoreCase("girl")) {
			String firstHalf=dadsName.substring(0,dadsName.length()/2);
			String lastHalf=momsName.substring(momsName.length()/2);
			System.out.println("The suggesting name for girl is "+firstHalf+lastHalf);
		}else {
			String firstHalf=momsName.substring(0,momsName.length()/2);
			String lastHalf=dadsName.substring(dadsName.length()/2);
			System.out.println("The suggesting name for boy is "+firstHalf+lastHalf);
		}

	}

}
