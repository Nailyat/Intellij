package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print numbers from 1 to 50 except those that are divisible by 3
		for(int i1=1; i1<=50; i1++){
			if(i1%3==0) { 
				continue;
			}
			System.out.print(i1+"  ");
			
		}

	}

}
