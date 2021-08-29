package com.syntax.class10;

public class Task2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array of countries
		 * While retrieving all values from an array print capital for each country
		 * Use 2 different loops
		 */
		
		String[] countries= {"USA","Canada","Italy"};
		String capital="";
		for (int i=0; i<countries.length; i++) {
			System.out.println(countries[i]);
		}
		
		for(String country:countries) {
			if(country.equals("USA")) {
				capital="Washington DC";
			}else if (country.equals("Canada")) {
				capital="Ottawa";		
		}else if(country.equals("Italy")) {
			capital="Rome";
		}
		System.out.println("The capital of "+country+" is "+capital);
		}
		
		
	
	}
}
