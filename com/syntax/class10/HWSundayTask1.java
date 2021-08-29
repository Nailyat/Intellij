package com.syntax.class10;

public class HWSundayTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create 2D array of cars: German, American, Korean, Italian. Then retrieve all values from that array using two different loops

		String [][] cars= {
				{"Mersedes", "BMW", "Audi"},
				{"Dodge", "Ford"},
				{"Kia", "Hundai"},
				{"Maserati", "Ferrari", "Fiat"}
		};
		
		for(int i=0; i<cars.length; i++) {
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("----Another way----");
		
	for(String [] car:cars) {
		for(String brand:car) {
			System.out.print(brand+" ");
		}
	}
		
		
		
		
		
	}

}
