package com.syntax.class08;

import java.util.Scanner;

public class HW2Saturday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int money;
		System.out.println("Please pay for your candy");
		do {
			money=scan.nextInt();
			
			if(money>3) {
				System.out.println("Please give less money");
			}else if(money<3) {
				System.out.println("Please give more money");
			}
		}while(money!=3);
		System.out.println("Please enjoy your candy");

	}

}
