package com.syntax.class09;

public class HWSaturdayTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from ate array
		
		String [] cars= {"BMW", "Honda", "Kia", "Lexus", "Tesla", "Jeep"};
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		System.out.println("-------------");
		for(String car:cars) {
			System.out.print(car+" ");	
		}

	}

}
