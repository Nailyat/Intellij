package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		str="some value";
		Scanner scan;
		scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(num);
		char singleChar=scan.next().charAt(0);
		System.out.println(singleChar);
		str=scan.next();
		System.out.println(str);

	}

}
