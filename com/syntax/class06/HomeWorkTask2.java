package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		String grade;
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=scan.nextLine();
		
		switch(grade) {

		case "A":
			grade="A-excellent";
			break;
		case "B":
			grade="B-Good";
			break;
		case "C":
			grade="C-Average";
			break;
		case "D":
			grade="D-Bad";
			break;
			default:
				grade="Not Acceptable";	
	}
		System.out.println("Your grade is "+grade);
	}
}
