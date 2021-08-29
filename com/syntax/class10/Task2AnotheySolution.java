package com.syntax.class10;

public class Task2AnotheySolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array of countries
		 * While retrieving all values from an array print capital for each country
		 * Use 2 different loops
		 */

		
		String[] countries= {"USA","Canada","Italy"};
		String capital="";
		
		for(int i=0; i<countries.length; i++) {
		switch(countries[i]) {
		case"USA":
			capital="Washington DC";
			break;
		case "Canada":
			capital="Ottawa";
			break;
		case "Italy":
			capital="Rome";
			break;	
		}
		System.out.println("The capital of "+countries[i]+" is "+capital);
	}

	}
}
