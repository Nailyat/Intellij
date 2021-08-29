package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----TASK1-----");
		
		Scanner scan;
		double num1, num2, num3, largest;
		scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		num3=scan.nextDouble();
		if (num1>num2 && num1>num2) {
			largest=num1;			
		}else if (num2>num1 && num2>num3) {
			largest=num2;
		}else  {
			largest=num3;
		
			System.out.println(largest+ " is the largest number");
		}
	

	}

}
