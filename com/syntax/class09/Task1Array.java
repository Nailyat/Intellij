package com.syntax.class09;

public class Task1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array of chars and store grades into it: A, B, C, D, E, F
		 * Then print a grade B
		 */
		
		char [] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]); //B
		
		char[]	grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		int size = grades.length; // length gives the size --> how many elements in that array
		System.out.println(size); //6
		System.out.println(grades[1]); //B
		
		int i=0;
		System.out.println(grades[i]); //A
		i++;
		System.out.println(grades[i]); //B
		
		System.out.println("--------Array with Loop--------"); 
		for(int j=0; j<size; j++) {
			System.out.println(grades[j]); 	
		}
		
		System.out.println("-------Another example-----------"); 
		
		String [] names= {"Nailya", "Talgat", "Daulet", "Ilyas", "Selina"};
		for(int n=0; n<names.length; n++) {
			System.out.println(names[n]);
		
		
		}
	}

}
