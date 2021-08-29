package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=3; i++) {
			if(i==1) {
				continue;
			}
			System.out.println("I am inside the loop");
			System.out.println(i);
		}
		System.out.println("----------------------------");
		//I want to print all numbers from 1 till 10 except number 5 and 9
		for(int i1=1; i1<=10; i1++){
			if(i1==5 || i1==9) { //in && condition can't be the same variable 
				continue;
			}
			System.out.print(i1+"  ");
			
		}

	}

}
