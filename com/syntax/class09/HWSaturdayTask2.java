package com.syntax.class09;

public class HWSaturdayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from ate array
		
		String [] animals= {"cat", "dog", "cow", "horse", "tiger", "monkey"};
			for(String animal:animals) {
				System.out.print(animal+" ");
		}
			System.out.println();	
			System.out.println("---------");
			for (int i=0; i<animals.length; i++) {
				System.out.print(animals[i]+" ");
			}

	}

}
