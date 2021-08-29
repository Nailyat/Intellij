package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2011;i<=2019; i++) {
			System.out.println("Hi it is year:");
			
			
			if(i==4) {
				System.out.println("I am stopping the loop");
				break;
			}
			System.out.println(i);
		}
		boolean summer=true;
		int temp=80;
		while(summer) {
			if(temp>95) {
				System.out.println("I do not love hot summer");
				break;
			}
		
		System.out.println("I love summer");
		temp+=2;

	}
	}
}
