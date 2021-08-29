package com.syntax.class10;

public class TwoDArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] food= {
				{"borcsh", "vareniki", "draniki"}, //1 row with 3 elements
				{"kebabs", "palaw", "mantu"}, //2 row with 3 elements
				{"tacos", "burito", "quesadilla", "salsa"}, //3 row with 4 elements
				{"pasta", "pizza", "risotto"}	// 4 row with 3 elements
		};
		
		System.out.println(food.length); //4 rows --> "length" means total number of the rows
		
		int sizeOfArray=food[0].length;
		System.out.println(sizeOfArray);
		
		int sizeOf1Array=food[3].length;
		System.out.println(sizeOf1Array);
		
		System.out.println(food[2][1]); // burito
		food[3][2]="olive"; //rename element inside the row
		System.out.println(food[3][2]);
		
		System.out.println("---------------");
		//how get all values from 2D array
		
		for(int i=0; i<food.length; i++) { //iterates over rows/arrays
			for(int j=0; j<food[i].length; j++) { //iterate over columns/each element from the array
				System.out.println(food[i][j]);
			}
		}
			
		
		
		
	}

}
