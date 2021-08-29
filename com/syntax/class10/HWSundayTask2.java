package com.syntax.class10;

public class HWSundayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Using 2D array create a grocery list
		 * Inside you should have an array of veggies, fruits, dairy and sweets.
		 * Retrieve all values from that array using 2 different loops. 
		 */
		
		String [][] grocery= {
				{"tomato", "potato", "cucumber", "pepper"},
				{"apple", "pear", "peach"},
				{"milk", "cheese", "butter"},
				{"cookie", "chocolate", "candy"}
		};
		for(int i=0; i<grocery.length; i++) {
			for (int j=0; j<grocery[i].length; j++) {
				System.out.print(grocery[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("---Another For Loop----");

		for(String [] food:grocery) {
			for (String list:food) {
				System.out.print(list+" ");
			}
		}
	}

}
