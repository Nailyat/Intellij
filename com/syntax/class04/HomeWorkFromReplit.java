package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkFromReplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
    int num3=scan.nextInt();
    if(num3>num2){
       if(num3>num1){
        System.out.println("The largest number is "+num3);
      }
    }
    if(num2>num1){
       if(num2>num3){
        System.out.println("The largest number is "+num2);
      }

    }if(num1>num2){
       if(num1>num3){
        System.out.println("The largest number is "+num1);
      }
    }
      
	  }
	

	}


