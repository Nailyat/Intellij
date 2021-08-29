package com.syntax.review.class04;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=10; i<15; i--) { //execute infinite times
			if(i==2) {
				break;
			}
				System.out.println(i);	
		}
		
		for ( int k=0; k<10; k+=1) {
		
			System.out.println(k);
			k--;
		}

	}

}
