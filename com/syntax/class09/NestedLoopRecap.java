package com.syntax.class09;

public class NestedLoopRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=5; i++) {
			System.out.println("Loop i");
			for (int j=1; j<4; j++) {
				System.out.println("Loop j");
			}
		}
		System.out.println("---------------MULTIPLICATION TABLE---------------");

		for (int a=1; a<=10; a++) {
			
			for(int b=1; b<=10; b++) {
				
				System.out.println(a+" * "+b+" = "+a*b);
				
			}
		}
		System.out.println("-----------------------");
		
		for (int c=0; c<=3; c++) {
			System.out.println("Outer loop "+c);
			for (int d=0; d<=3; d++) {
				System.out.println("Inner loop "+d);
			}
		System.out.println("------------");
		break; //stop the next block of code
		}
		
System.out.println("-----------------------");
		
		for (int y=0; y<=3; y++) {
			System.out.println("Outer loop "+y);
			for (int z=0; z<=3; z++) {
				System.out.println("Inner loop "+z);
				break; //stop the next block of code
			}
			System.out.println("-----------");
		
		}
		
		boolean boo=true;
		for (int p=0; p<3; p++) {
			System.out.println("Outer for loop");
			while (boo) {
				System.out.println("I am nested while loop");
				break;
			}
			System.out.println("      !!!          ");
		}
	}

}
