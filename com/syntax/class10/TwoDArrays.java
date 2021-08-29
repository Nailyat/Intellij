package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int [] b=new int[3];
		int[][] c=new int [3][4]; //creating a 2D Array
		
		c[0][0]=11; //first row and first column
		c[0][1]=12; //first row and second column
		c[0][2]=13; //first row and third column
		c[0][3]=14; //first row and forth column
		
		c[1][0]=20; // second row and first column
		c[1][1]=30; // second row and second column
		c[1][2]=40; // second row and third column
		c[1][3]=50; // second row and forth column
		
		c[2][0]=100; // third row and first column
		c[2][1]=200; // third row and second column
		c[2][2]=300; // third row and third column
		c[2][3]=400; // third row and forth column

		System.out.println(c[1][3]); //50
		System.out.println(c[2][1]); //200
		
		System.out.println("---------Another way of creating a 2D array------");
		
		int[][] myArray= {
				{11, 12, 13, 14, 15}, //1 array
				{20, 30,  40, 50}, //2 array
				{100, 200, 300, 400} // 3 array
		};
		System.out.println(myArray[0][4]); // 15
		System.out.println(myArray[1][0]); // 20
		
		
		
		
		
		
		}

}
