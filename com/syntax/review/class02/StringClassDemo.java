package com.syntax.review.class02;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Nailya";
		String country="USA";
		System.out.println(name+" "+country);
		int num1=10;
		int num2=20;
		System.out.println(num1+num2);
		
		String strNum="10";
		System.out.println(num1+strNum);
		
		System.out.println("Result of addition is "+num1+num2); //Result of addition is 1020
		System.out.println("Result of addition is "+(num1+num2)); //Result of addition is 30
		
		int number1=10;
		int number2=2;
		System.out.println(number1%number2); //0
		
		int number3=11;
		int number4=2;
		System.out.println(number3%number4); //1
		
		int number5=1;
		int number6=1000;
		System.out.println(number5%number6); //1
		
		int number7=123456;
		int number8=10;
		System.out.println(number7%number8); //6
		System.out.println(number7/number8); //12345 (no decimals, because it's int)
		int number9=(int)(number7/number8); 
		System.out.println(number9);//12345
	}
	

}
