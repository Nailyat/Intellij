package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		int quiz, midTerm, finalScore, aveScore;
		String grade=null;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your quiz, mid term and final scores");
		quiz=scan.nextInt();
		midTerm=scan.nextInt();
		finalScore=scan.nextInt();
		aveScore=(quiz+midTerm+finalScore)/3;
		if(aveScore>=90) {
			grade="A";
		}else if(aveScore>=70 && aveScore<90) {
			grade="B";
		}else if(aveScore>=50 && aveScore<70) {
			grade="C";
		}else if(aveScore<50) {
			grade="D";
		}
		
	System.out.println("The grade of your average score is "+grade );
	}
}
