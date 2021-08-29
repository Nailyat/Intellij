package com.syntax.class07;

public class TasksForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---------Task 1---------");
		// Print numbers from 1 to 100 in one line with space
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}

		System.out.println(" ");
		System.out.println("---------Task 2--------");
		// Print numbers from 100 to 1
		for(int j=100; j>=1; j--) {
			System.out.print(j+" ");
		}
		System.out.println(" ");
		System.out.println("-----------Task 3----------");
		// Print even numbers from 20 to 1
		for(int k=20; k>=1; k-=2) {
			System.out.print(k+" ");
		}
		
		System.out.println(" ");
		System.out.println("------Task 4--------");
		//Print odd numbers between 20 and 50
		for(int n=20; n<=50; n+=1) {
			System.out.print(n+" ");
		}
	}

}
