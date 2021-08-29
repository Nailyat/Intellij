package com.syntax.class03;

public class WhatHappensJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int i=1.99;narrowing or explicit casting
		//double d=100; widening or implicit
		
		
		byte b=(byte)128; //narrowing
		System.out.println(b);
		
		int num=20;
		int num1=3;
		System.out.println(num/num1);
		
		double num2=20;
		double num3=3;
		System.out.println(num2/num3);
		
		float f=10.99f;
		double number=10.99;
		
		int t=100;
		
		int n1=20;
		int n2=3;
		double dd=n1/n2; //we divide 2 int values and only then result are storing in the double type
		System.out.println(dd);//6.0
		
		
		
		}

}
