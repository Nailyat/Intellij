package com.syntax.class02;

public class ArithemeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithemetic signs 
		/*
		 * +,-,*,/,%
		 */
		
		int num1=90;
		int num2=10;
		
		//syso +ctrl+space
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;
		System.out.println(sum);
		
		int sub=num1-num2;
		System.out.println(sub);
		
		double n=2.99;
		double n1=3.05;
		double total=n+n1;
		System.out.println(total);
		
		double result=n/n1;
		System.out.println(result);
		
		float f1=2.99f;
		float f2=3.05f;
		float floatDivision=f1/f2;
		System.out.println(floatDivision);// Float is smaller than Double, that's why it makes around
		
		//Modules (%)
		int number1, number2, mod;
		number1=10;
		number2=2;
		mod=number1%number2;
		System.out.println(mod); //result is 0
		
		number2=3;
		mod=number1%number2;
		System.out.println(mod); //result is 1
		
		//what is the result?
		int guess;
		guess=20+20*2;
		System.out.println(guess); // result is 60, basic math
		
		guess=2*2+(4*10);
		System.out.println(guess); //result is 44
		
		//TASK
		
		double nb1=2.12;
		double nb2=3.12;
		double sum1=nb1+nb2;
		double sub1=nb1-nb2;
		double mul=nb1*nb2;
		double dev1=nb1/nb2;
		
		System.out.println("The sum of 2 numbers "+nb1+" and "+nb2+" is equal to "+sum1);
		System.out.println("The substraction of 2 numbers "+nb1+" and "+nb2+" is equal to "+sub1);
		System.out.println("The multiplecation of 2 numbers "+nb1+" and "+nb2+" is equal to "+mul);
		System.out.println("The division of 2 numbers "+nb1+" and "+nb2+" is equel to "+dev1);
		
		double number3=3.9;
		double sq=number3*number3;
		System.out.println("The square of the "+number3+" is "+sq);
		
		int w=5;
		int h=8;
		int A=w*h;
		int P=2*(w+h);
		System.out.println("The perimeter of a rectangle with width ="+w+" and height ="+h+" is equal to "+P+" and the area is "+A);
		
		
		
		
		
		
		
		
	}

}
