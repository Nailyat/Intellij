package com.syntax.class03;

public class IfStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=120;
		int num2=200;
		if (num1>num2) { // if block executes only when condition is true
			System.out.println("num1 "+num1+" is large than num2 "+num2);
		}
		
		double money=100;
		double $priceCookies=5.99; //if value change to 15.99 then this no result 
		if (money>$priceCookies) {
			System.out.println("I am buying those cookies");
			
		}
		
		System.out.println("End of my code");
		

	}

}
