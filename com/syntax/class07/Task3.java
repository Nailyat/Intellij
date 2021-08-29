package com.syntax.class07;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
		  * Print even numbers from 20 to 100
		  */

		int i=20;
		while (i<=100) {
			if(i%2==0) { 
				System.out.print(i+" ");
			}
			i++;
		}
		  i=20;
		  while (i<=100) {
			  System.out.print(i+" "); 
		  }
		i+=2; //another way to oder print even numbers
	}

}
